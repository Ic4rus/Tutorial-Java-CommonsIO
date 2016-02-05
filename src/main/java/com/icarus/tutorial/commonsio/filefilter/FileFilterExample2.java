package com.icarus.tutorial.commonsio.filefilter;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.io.filefilter.SuffixFileFilter;

public class FileFilterExample2 {
	
	public static void main(String[] args) {
		
		String[] suffixs = new String[]{".js", ".css"};
		FileFilter filter = new SuffixFileFilter(suffixs);
		
		File dir = new File("D:/test");
		
		// Danh sách file có phần mở rộng js hoặc css trong thư mục D:/test
		File[] list = dir.listFiles(filter);
		
		for (File file : list) {
			System.out.println("File " + file.getAbsolutePath());
		}
	}

}
