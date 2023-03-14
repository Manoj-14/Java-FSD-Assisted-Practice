package com.assisstedPractices.section3;

public class Synchronization6 {
	public static void main(String[] args) {
		SendingMessage sender = new SendingMessage();
		
		Thread firstMsgThread = new Thread(new MsgRunnable(sender, "Hello"));
		
		Thread secondMsgThread = new Thread(new MsgRunnable(sender, "Hiii"));
		
		firstMsgThread.start();
//		try {
//			firstMsgThread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		secondMsgThread.start();
	}
}

class SendingMessage {

	public synchronized void sendMsg(String str) {
		Utils.printMessage("Sending message " + str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		Utils.printMessage("Message sent");
	}
}

class MsgRunnable implements Runnable {

	SendingMessage sender;
	String msg;

	public MsgRunnable(SendingMessage sender, String msg) {
		this.sender = sender;
		this.msg = msg;
	}

	@Override
	public void run() {
		this.sender.sendMsg(this.msg);
	}

}