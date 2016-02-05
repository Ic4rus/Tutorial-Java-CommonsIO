package com.icarus.tutorial.commonsio.comparator;

import java.io.File;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.SizeFileComparator;

public class SizeFileComparatorExample {
	
	public static void main(String[] args) {
		
		// Thư mục hiện tại (Thư mục của project)
		File directory = new File(".");
		File[] files = directory.listFiles();
		
		System.out.println("Sap xep mac dinh");
		displayFiles(files);
		
		Arrays.sort(files, SizeFileComparator.SIZE_COMPARATOR);
		System.out.println("\nSizeFileComparator.SIZE_COMPARATOR (Tang dan, thu muc coi nhu kich thuoc bang 0");
		displayFiles(files);
		
		Arrays.sort(files, SizeFileComparator.SIZE_REVERSE);
		System.out.println("\nSizeFileComparator.SIZE_REVERSE (Giam dan, thu muc coi nhu kich thuoc bang 0");
		displayFiles(files);
		
		Arrays.sort(files, SizeFileComparator.SIZE_SUMDIR_COMPARATOR);
		System.out.println("\nSizeFileComparator.SIZE_COMPARATOR (Tang dan, su dung kich thuoc thu muc");
		displayFilesWithDirectorySizes(files);
		
		Arrays.sort(files, SizeFileComparator.SIZE_SUMDIR_REVERSE);
		System.out.println("\nSizeFileComparator.SIZE_REVERSE (Giam dan, su dung kich thuoc thu muc");
		displayFilesWithDirectorySizes(files);
		
	}
	
	public static void displayFiles(File[] files) {
		for (File file : files) {
			System.out.printf("%-20s Size: " + file.length() + "\n", file.getName());
		}
	}
	
	public static void displayFilesWithDirectorySizes(File[] files) {
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.printf("%-20s Size: " + FileUtils.sizeOf(file) + "\n", file.getName());
			} else {
				System.out.printf("%-20s Size: " + file.length() + "\n", file.getName());
			}
		}
	}

}
