package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Collections111 {
public static void main(String[] args) {
	
	//Datatype[] variableName=new DataType[4];
	//vaiableName[]
		
	//How to store the value
	//How to retrive
	
//	String[] intArray=new String[4];
//	intArray[0]="a";
//	intArray[1]="b";
//	intArray[2]="c";
//	intArray[3]="d";
//	
//	//or
//	
//	String [] arr=new String[] {"a","b","c","d"};
//	
//	//2 ways
//	
//	//for-each
//	
//	for(String s:arr) {
//		System.out.println(s);
//	}
//	
//	
//	//for
//	
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	
	
	ArrayList<String> temp=new ArrayList<String>();
	temp.add("a");
	temp.add("a");
	temp.add("a");
	temp.add("a");
	temp.add("a");
	temp.add("a");
	temp.add("a");
	temp.add("a");
	temp.add("a");
	
	
	for(String s:temp) {
		System.out.println(s);
	}
	
	for(int i=0;i<=temp.size();i++) {
		System.out.println(temp.get(i));
	}
	
	
}
}
