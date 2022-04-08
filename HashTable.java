package LinkList;

import java.util.ArrayList;
import java.util.Scanner;

public class HashTable {
	public static void main(String[] args) {
		System.out.println("hash table");
		int input[]= {15,2,45,1,10,12,5,6,78,85,63,99,23};
		
		System.out.println("Input Data");
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]+" ," );
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many keys you want.......enter the number");
		int numberOfKey=scanner.nextInt();
		System.out.println("numberOfKey "+numberOfKey);
		
		Object[] objects=new Object[numberOfKey];
		
		for(byte i=0;i<numberOfKey;i++)
		{
			int key=input[i]%numberOfKey;
			
			objects[i]=new ArrayList<Integer>();
		}
		for(byte i =0; i<input.length;i++) {
			int key = input[i] % numberOfKey;
			ArrayList<Integer> list = (ArrayList<Integer>) objects[key];
			list.add(input[i]);
		}
		
		
		for(byte i =0; i<numberOfKey;i++) {
			ArrayList<Integer> list = (ArrayList<Integer>) objects[i];
			System.out.println("Key = "+ i+ " Values = "+list);
		}
		
	}
}
