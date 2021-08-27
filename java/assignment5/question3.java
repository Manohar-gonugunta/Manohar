package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);

        Integer[] intArray = new Integer[l.size()];
        intArray = l.toArray(intArray);

		System.out.println("Before Swapping Array Elements:");
		for(Integer e:intArray) {
			System.out.print(e+" ");
		}
		
		swap(intArray,1,2); 
		
		System.out.println("\nAfter Swapping Array Elements:");
		for(Integer e:intArray) {
			System.out.print(e+" ");
		}
		
	}
	
	public static <E> void swap(E[] arr,int i, int j) {
		E temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
        
	}

}
