package singlenumber;

import java.util.Scanner;

public class Singlenumber{
	public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
        int n= scanner.nextInt();
        System.out.println("Enter array Elements");
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println(findsinglenumber(array,n));
}
	public static int findsinglenumber(int array[],int n) {
	int result=0;
	for(int i=0;i<n;i++) {
		result = result^array[i];
	}
	return result; 
}
}