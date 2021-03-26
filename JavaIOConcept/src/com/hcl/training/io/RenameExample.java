package com.hcl.training.io;

import java.io.File;

public class RenameExample {
	public static void main(String[] args) {
		// Old File
		File oldfile = new File("C:/Java Training/newfile.txt");
		// New File
		File newfile = new File("C:/Java Training/File.txt");
		/*
		 * renameTo() return boolean value It return true if rename operation is
		 * successful
		 */
		boolean flag = oldfile.renameTo(newfile);
		if (flag) {
			System.out.println("File renamed successfully");
		} else {
			System.out.println("Rename operation failed");
		}
	}
}