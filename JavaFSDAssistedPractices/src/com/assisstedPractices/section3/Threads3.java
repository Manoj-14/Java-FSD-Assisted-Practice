package com.assisstedPractices.section3;

public class Threads3 {
	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//		myThread.start();
		Utils.printMessage("Main Thread starting....");
		
		Thread t = new Thread(new Worker());
		t.start();
		while(Worker.count <= 10) {
			Utils.printMessage(""+ ++Worker.count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Utils.printMessage("Main Thread starting....");
		
	}
}

class MyThread extends Thread{
	public void run() {
		Utils.printMessage("Concurrent thread is running");
	}
}

class Worker implements Runnable{
	public static int count = 0;
	
	
	@Override
	public void run() {
		while(Worker.count <= 10) {
			Utils.printMessage(""+ ++Worker.count);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}