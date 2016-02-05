package com.icarus.tutorial.commonsio.fileutils;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilsReadFile {
	
	public void readFile() throws Exception {
		File file = new File(this.getClass().getResource("/test.txt").toURI());
		List<String> lines = FileUtils.readLines(file);
		
		for (String s : lines) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		FileUtilsReadFile furf = new FileUtilsReadFile();
		try {
			furf.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
