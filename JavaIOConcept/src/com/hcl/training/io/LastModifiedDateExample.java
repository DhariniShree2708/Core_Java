package com.hcl.training.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDateExample {
	public static void main(String[] args) {
		// Specify the file path and name
		File file = new File("C:/Java Training/Food.txt");
		//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy HH:mm a");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	}
}