package com.icarus.tutorial.commonsio.lineiterator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class LineIteratorExample {
	
	public static void main(String[] args) {
		try {
			File file = new File("D:/test.txt");
			LineIterator it = FileUtils.lineIterator(file, "UTF-8");
			try {
				while (it.hasNext()) {
					String line = it.nextLine();
					if (line != null && line.startsWith("##")) {
						System.out.println(line.substring(2));
					}
				}
			} finally {
				LineIterator.closeQuietly(it);
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
