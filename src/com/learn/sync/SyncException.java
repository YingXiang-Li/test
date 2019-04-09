package com.learn.sync;

import javax.management.RuntimeErrorException;

public class SyncException {

	private int i = 0;

	public synchronized void operation() {
		while (true) {
			i++;
			try {
				Thread.sleep(200);
				System.out.println(Thread.currentThread().getName() + ",i=" + i);
				if (i == 10) {
					Integer.parseInt("a");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("log info i= " + i);
				Error error = new Error("运行期间出现异常！");
				throw new RuntimeErrorException(error);
			}
		}
	}

	public static void main(String[] args) {

		final SyncException se = new SyncException();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				se.operation();
			}

		}, "t1");
		t1.start();
	}
}
