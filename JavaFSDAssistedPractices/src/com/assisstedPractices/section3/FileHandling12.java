package com.assisstedPractices.section3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling12 {
	public static void main(String[] args) {
		String path = "D:\\Java FSD\\Java FSD Assisted Practice\\JavaFSDAssistedPractices\\src\\com\\assisstedPractices\\data\\data";
//		fileInputStream(path);
//		System.out.println("\n------------------------------------");
//		fileOutPutStream(path);
//		System.out.println("\n------------------------------------");
//		fileInputStream(path);
//		System.out.println("\n------------------------------------");
//		fileReader(path);
//		System.out.println("\n------------------------------------");
//		fileWriter(path);
//		System.out.println("\n------------------------------------");
//		fileReader(path);
//		System.out.println("\n------------------------------------");
		bufferReader(path);
		System.out.println("\n------------------------------------");
		bufferWriter(path);
		System.out.println("\n------------------------------------");
		bufferReader(path);
	}

	public static void fileInputStream(String path) {

		try (FileInputStream fip = new FileInputStream(path);) {
			int i;
			System.out.println("Reading the file ....");
			while ((i = fip.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileOutPutStream(String path) {
		try (FileOutputStream fos = new FileOutputStream(path);) {
			String data = "First Line Updated\nSecond Line Updated\nThird Line Updated";
			System.out.println("Writing the file ....");
			fos.write(data.getBytes());
			System.out.println("File updated");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileReader(String path) {
		try (FileReader fr = new FileReader(path);) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileWriter(String path) {
		try(FileWriter fr = new FileWriter(path) ;){
			String data = "***File Write Update***\nFirst Line Updated\nSecond Line Updated\nThird Line Updated";
			System.out.println("Writing the file ....");
			fr.write(data);
			System.out.println("File Writed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void bufferReader(String path) {
		try(FileReader fr = new FileReader(path);BufferedReader br = new BufferedReader(fr);) {
			String line ;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void bufferWriter(String path) {
		try(FileWriter fw = new FileWriter(path); BufferedWriter bw = new BufferedWriter(fw)){
			String line = "***Buffer Writer (Update)***\nFirst Line Updated\nSecond Line Updated\nThird Line Updated";
			System.out.println("Writing a file");
			bw.write(line);
			System.out.println("File Writed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
