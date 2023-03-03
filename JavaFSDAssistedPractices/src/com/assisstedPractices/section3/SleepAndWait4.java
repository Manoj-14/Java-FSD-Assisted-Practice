package com.assisstedPractices.section3;

public class SleepAndWait4 {
	public static void main(String[] args) {
		Utils.printMessage("Beginning.....");
		Thread t = new Thread(new PrintWorker());
		t.start();
		synchronized (t) {
			Utils.printMessage("Waiting to print Numbers");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Utils.printMessage("Notified...");
		}
		Utils.printMessage("Ending.....");
	}
}

class PrintWorker implements Runnable {

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 20; i++) {
				Utils.printMessage("" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.notify();
		}
	}

}