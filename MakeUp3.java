package MakeUp;

import java.util.*;

public class MakeUp3 {

	public static void main(String[] args) {

		boolean play = true;
		while (play) {
			Scanner console = new Scanner(System.in);
			System.out.println("Type the temperature you want");
			double number = console.nextDouble();
			System.out.println("Type whether it's Celsius or Fahrenheit");
			String symbol = console.next();

			if (symbol.startsWith("C") || symbol.startsWith("c")) {
				double exchangeNumber = 9 * number / 5 + 32.0;
				String exchangeSymbol = "F";
				System.out.println(number + " " + symbol + "=" + exchangeNumber + " " + exchangeSymbol);
			} else if (symbol.startsWith("F") || symbol.startsWith("f")) {
				double exchangeNumber = (number - 32) * 5 / 9;
				String exchangeSymbol = "C";
				System.out.println(number + " " + symbol + "=" + exchangeNumber + " " + exchangeSymbol);
			}
console.close();
			// TODO Auto-generated method stub

		}
	}
}
