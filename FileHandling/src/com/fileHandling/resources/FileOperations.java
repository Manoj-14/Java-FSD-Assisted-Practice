package com.fileHandling.resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	private String path ;
	public FileOperations(String path) {
		this.path = path ;
	}
	
	public void read() {
		try (FileReader fr = new FileReader(this.path); BufferedReader br = new BufferedReader(fr);) {
			System.out.println("");
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String str) {
		try (FileWriter fw = new FileWriter(this.path); BufferedWriter bw = new BufferedWriter(fw)) {
			System.out.println("Writing to file : "+this.path);
			bw.write(str);
			System.out.println("File Updated");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void append(String str) {
		try (FileWriter fw = new FileWriter(this.path,true); BufferedWriter bw = new BufferedWriter(fw)) {
			System.out.println("appending to file :"+this.path);
			bw.append("\n"+str);
			System.out.println("File Writed....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
