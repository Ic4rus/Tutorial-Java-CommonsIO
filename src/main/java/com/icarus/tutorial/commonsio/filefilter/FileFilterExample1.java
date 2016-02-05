package com.icarus.tutorial.commonsio.filefilter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample1 {
	
	public static void main(String[] args) {
		
		FileFilter filter = new MyFileFilter();
		
		File dir = new File("D:/test");
		
		// Lấy ra danh sách file có phần mở rộng js hoặc css
		File[] list = dir.listFiles(filter);
		
		for (File file : list) {
			System.out.println("File " + file.getAbsolutePath());
		}
	}
	
	// Bộ lọc chấp nhận các file kiểu (*.js, *.css)
	static class MyFileFilter implements FileFilter {

		public boolean accept(File pathname) {
			String abstractPath = pathname.getAbsolutePath();
			if (abstractPath.endsWith(".js") || abstractPath.endsWith(".css")) {
				return true;
			}
			return false;
		}
	}

}
