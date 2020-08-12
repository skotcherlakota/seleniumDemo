package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
public static void main(String[] args) throws IOException {
	FileReader reader=new FileReader("test.txt");
	BufferedReader buff=new BufferedReader(reader);
	String line;
	while((line = buff.readLine())!=null){
		System.out.println(line);
	}
	
	reader.close();
}
}
