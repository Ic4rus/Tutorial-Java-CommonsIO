package com.icarus.tutorial.commonsio.filefilter;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class CombineTwoFilterExample {
	
	public static void main(String[] args) {
		String[] suffixs = new String[]{".js", ".css"};
		IOFileFilter filter1 = new SuffixFileFilter(suffixs);
		
		IOFileFilter filter2 = HiddenFileFilter.VISIBLE;
		
		// Bộ lọc mới chấp nhận các file có đuôi js, css và phải là file không ẩn
		IOFileFilter newFilter = FileFilterUtils.andFileFilter(filter1, filter2);
		
		File dir = new File("D:/test");
		
		File[] list = dir.listFiles((FileFilter) newFilter);
		
		for (File file : list) {
			System.out.println("File " + file.getAbsolutePath());
		}
	}

}
