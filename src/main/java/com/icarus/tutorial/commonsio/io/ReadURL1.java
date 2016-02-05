package com.icarus.tutorial.commonsio.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadURL1 {

	public static void readURL() throws MalformedURLException, IOException {
		InputStream in = new URL("http://commons.apache.org").openStream();
		try {
			InputStreamReader inR = new InputStreamReader(in);
			BufferedReader buf = new BufferedReader(inR);
			String line;
			while ((line = buf.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			in.close();
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
