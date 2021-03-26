package com.hcl.training.io;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class AppendingExample1 {
	public static void main(String[] args) {
		try {
			String content = " I am from Salem , " + "Tamil Nadu";
			// Specify the file name and path here
			File file = new File("C:/Java Training/newfile.txt");

			/*
			 * This logic is to create the file if the file is not already present
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			// Here true is to append the content to file
			FileWriter fw = new FileWriter(file, true);
			// BufferedWriter writer give better performance
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			// Closing BufferedWriter Stream
			bw.close();

			System.out.println("Data successfully appended at the end of file");

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}
}