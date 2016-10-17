package simplearray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("\nEnter new element: ");
			arr[i] = input.nextInt();
		}

		input.close();

		printReverse(arr, arr.length);

		System.out.println("Index: " + maxNegative(arr, arr.length));
		
		Arrays.sort(arr);
		
		printArray(arr, arr.length);

	}

	public static void printReverse(int[] x, int n) {
		for (int i = n - 1; i >= 0; i--)
			System.out.println("arr[" + i + "] = " + x[i]);
	}

	public static int maxNegative(int[] x, int n) {
		int maxNegative = 0;
		int index = -1;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			if (flag == true && x[i] < 0) {
				maxNegative = x[i];
				index = i;
				flag = false;
				System.out.println(index);
			}

			if (x[i] < 0 && x[i] > maxNegative) {
				maxNegative = x[i];
				index = i;
				System.out.println(index);
			}

		}

		if (flag) {
			System.out.println("No negative elemtns in the seqance!");
			System.exit(13);
		} else {
			System.out.println("Max negative is: " + maxNegative);
		}

		return index;
	}
	
	public static void printArray (int [] x, int n) 
	{
		for (int i = 0; i < n; i++)
			System.out.println("arr[" + i + "] = " + x[i]);
	}
	

}
