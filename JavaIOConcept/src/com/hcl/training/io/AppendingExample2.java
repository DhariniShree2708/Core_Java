package com.hcl.training.io;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class AppendingExample2 {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Java Training/newfile.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			// This will add a new line to the file content
			pw.println("");
			/*
			 * Below three statements would add three mentioned Strings to the file in new
			 * lines.
			 */
			pw.println("God is Everywhere");
			pw.println("Knowledge");
			pw.println("Flowers");
			pw.close();

			System.out.println("Data successfully appended at the end of file");

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}
}