package demo;

public class SampleProgram {
public static void main(String[] args) {
	String name="Niharika";
	String output = "";
	
	String arr[]=name.split("");
	
	for(int i=0;i<arr.length;i++) {
		//System.out.println(arr[i]);
		if(!arr[i].equals("i")) {
			System.out.println(arr[i]);
		}
		else {
			System.out.println("A");
		}
	}
	
	
	
	
	
//	for(int i=0;i<name.length();i++) {
//		//System.out.println(name.charAt(i));
//		if(name.charAt(i)!='i') {
//			System.out.println(name.charAt(i));
//			output=output+name.charAt(i);
//			System.out.println(output);
//		}
//	}
}
}
