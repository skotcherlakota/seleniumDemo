package demo;

import java.util.*;
public class sortWordsInList  {

	public static void main(String args[]){
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("India2");
	   listofcountries.add("India1");
	   listofcountries.add("US");
	   listofcountries.add("China");
	   listofcountries.add("Denmark");

	   /*Unsorted List*/
	   System.out.println("Before Sorting:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(listofcountries);

	   /* Sorted List*/
	   System.out.println("After Sorting:");
	   for(String counter: listofcountries){
			System.out.println(counter);
		}
	}
}