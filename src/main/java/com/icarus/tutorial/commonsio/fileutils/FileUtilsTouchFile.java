package com.icarus.tutorial.commonsio.fileutils;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class FileUtilsTouchFile {
	
	public static void main(String[] args) {
		try {
			// D:/text.txt chưa có trên hệ thống
			File testFile = new File("D:/text.txt");
			
			// Lấy ra thời gian sửa đổi lần cuối
			long fileTimestamp = testFile.lastModified();
			System.out.println("Time in milis " + fileTimestamp);
			
			// Sử dụng method touch(...)
			// Nếu file chưa tồn tại nó sẽ tạo ra file rỗng
			// Và thay đổi thời gian sửa lần cuối của file bằng thời gian hiện tại
			FileUtils.touch(testFile);
			System.out.println("Time in milis updated " + testFile.lastModified());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
