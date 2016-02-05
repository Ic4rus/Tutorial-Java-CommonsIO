package com.icarus.tutorial.commonsio.filefilter;

import java.io.File;

import org.apache.commons.io.filefilter.HiddenFileFilter;

public class HiddenFileFilterExample {
	
	public static void main(String[] args) {
		File dir = new File("D:/test");
		String[] files = dir.list(HiddenFileFilter.HIDDEN);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
