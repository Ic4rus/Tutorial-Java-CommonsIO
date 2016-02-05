package com.icarus.tutorial.commonsio.fileutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsCopyDirectory {
	
	public static void main(String[] args) {
		
		File srcDir = new File("C:/test");
		File destDir = new File("D:/test/abc");
		try {
			FileUtils.copyDirectory(srcDir, destDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
