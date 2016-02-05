package com.icarus.tutorial.commonsio.fileutils;

import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;

public class FileSystemUtilsFreeSpaceKb {
	
	public static void main(String[] args) {
		try {
			Long kb = FileSystemUtils.freeSpaceKb("E:/");
			System.out.println("Free Space: " + kb + "KB");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
