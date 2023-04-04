package com.greatlearning.currency;

import java.util.Scanner;

/**
 * @author Aditi
 *
 */
public class CurrencyDenomination {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		int currencyCount = scanner.nextInt();
		int currencyCountArray[] = new int[currencyCount];

		System.out.println("enter the currency denominations value");

		int currencyArray[] = new int[currencyCount];
		for (int count = 0; count < currencyCount; count++)
			currencyArray[count] = scanner.nextInt();

		int temp = 0;
		for (int i = 0; i < currencyArray.length; i++) {
			for (int j = i + 1; j < currencyArray.length; j++) {
				if (currencyArray[i] < currencyArray[j]) {
					temp = currencyArray[i];
					currencyArray[i] = currencyArray[j];
					currencyArray[j] = temp;
				}
			}
		}

		System.out.println("enter the amount you want to pay");
		int amountToPay = scanner.nextInt();

		// ALgo Starts

		// count notes using Greedy approach
		for (int i = 0; i < currencyArray.length; i++) {
			if (amountToPay >= currencyArray[i]) {
				currencyCountArray[i] = amountToPay / currencyArray[i];
				amountToPay = amountToPay % currencyArray[i];
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");

		for (int i = 0; i < currencyArray.length; i++) {
			if (currencyCountArray[i] != 0) {
				System.out.println(currencyArray[i] + " : " + currencyCountArray[i]);
			}
		}

	}

}
