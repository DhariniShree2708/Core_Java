package com.hcl.training.io;

import java.io.File;
import java.io.IOException;

public class MakeWritableFile {

	public static void main(String[] args) throws IOException {
		File myfile = new File("C:/Java Training/Food.txt");
		// changing the file mode to writable
		myfile.setWritable(true);
		if (myfile.canWrite()) {
			System.out.println("File is writable.");
		} else {
			System.out.println("File is read only.");
		}
	}
}