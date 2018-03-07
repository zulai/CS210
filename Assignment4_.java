package assignment4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame; 
import java.util.*; 


public class Assignment4_ extends JFrame {

static int width = 800;
static int height = 600;
static int R, G, B;
static int R2, G2, B2;
static int R3, G3, B3;
static int x1, y1, size1, speedX1, speedY1;
static int x2, y2, size2, speedX2, speedY2;
static int x3, y3, size3, speedX3, speedY3;
static Color color1;
static Color color2;
static Color color3;
public Assignment4_() {
    super("Your Title");
    setBounds(100, 100, width, height);  // at your monitor 
    setResizable(false);
    setVisible(true);	
    setDefaultCloseOperation(EXIT_ON_CLOSE);
} 


public static void createBall(){
   Random rand = new Random();   // for random number generator
   R = rand.nextInt(256);
   G = rand.nextInt(256);
   B = rand.nextInt(256);
   color1 = new Color(R, G, B);
   x1 = rand.nextInt(width); 
   y1 = rand.nextInt(height); 
   size1 = rand.nextInt(90)+20;
   speedX1 = rand.nextInt(5)+1;
   speedY1 = rand.nextInt(5)+1;
   
   Random rand2 = new Random();   // for random number generator
   R2 = rand2.nextInt(256);
   G2 = rand2.nextInt(256);
   B2 = rand2.nextInt(256);
   color2 = new Color(R2, G2, B2);
   x2 = rand2.nextInt(width); 
   y2 = rand2.nextInt(height); 
   size2 = rand2.nextInt(90)+20;
   speedX2 = rand2.nextInt(5)+1;
   speedY2 = rand2.nextInt(5)+1;
   
   Random rand3 = new Random();
   R3 = rand3.nextInt(256);
   G3 = rand3.nextInt(256);
   B3 = rand3.nextInt(256);
   color3 = new Color(R3, G3, B3);
   x3 = rand3.nextInt(width); 
   y3 = rand3.nextInt(height); 
   size3 = rand3.nextInt(90)+20;
   speedX3 = rand3.nextInt(5)+1;
   speedY3 = rand3.nextInt(5)+1;
}

 public void paint(Graphics g) {
   
    g.setColor(Color.BLACK);
   g.fillRect(0, 0, getWidth(), getHeight());
   
    g.setColor(color1);
    g.setColor(Color.GREEN);
    x1+=speedX1; 	
      if (x1>width) {speedX1=speedX1*-1;}  // collision - right wall
     
    y1+=speedY1;
      if (y1>height) {speedY1=speedY1*-1;} // collision - bottom
      
}
}