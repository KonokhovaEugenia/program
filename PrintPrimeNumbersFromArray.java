package lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPrimeNumbersFromArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������� ������ ������� n");
		int n=in.nextInt();
		
		int[]arr=new int[n];
		System.out.println("������� ������");
		for (int i=0;i<arr.length;i++)
		{arr[i]=in.nextInt();}
		for (int i=0;i<arr.length;i++)
		{System.out.print(arr[i]+"  ");}
		System.out.println();
		findPrimeNumbers(arr);
	}
	
	public static boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 3; i < n; i += 2) {
            if (n < 1)
                return false;
            if (n == 2)
                return true;
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return (n % 2 != 0 && isPrime) || n == 2;
    }
	
	public static void findPrimeNumbers(int[] sourceNumbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i<sourceNumbers.length; i++) {
            if (isPrimeNumber(sourceNumbers[i])) {
                result.add(sourceNumbers[i]);
            }
        }
        System.out.println("������� �����: " + result);
    }
}
