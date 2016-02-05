package com.icarus.tutorial.commonsio.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class ReadURL2 {
	
	public static void readURL() throws MalformedURLException, IOException {
		InputStream in = new URL("http://commons.apache.org").openStream();
		try {
			System.out.println(IOUtils.toString(in));
		} finally {
			IOUtils.closeQuietly(in);
		}
	}
	
	public static void main(String[] args) {
		try {
			readURL();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
