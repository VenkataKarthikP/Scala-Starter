package com.cloudwick.training.scala;

import java.io.IOException;


public class ReaderTest {

	public static void main(String[] args) throws IOException {
		Reader1 obj = new Reader1("Input.txt");
		
		int c =0 ;
		
		while( (c = obj.read() )!= -1){
			System.out.print((char)c);
		}
			
		
	}

}
