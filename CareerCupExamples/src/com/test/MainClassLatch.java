package com.test;

public class MainClassLatch {
	
	public static void main(String[] args) throws InterruptedException{
		CountDownLatchExample count = new CountDownLatchExample();
		 
		
		for(int i = 0; i < 10; i++){
			count.new MyThread(i+" : Thread Name").start();
		}
		
		//Thread.sleep(5000);
		count.stopCountDown();
		//Thread.sleep(5000);
		//count.startWait();
		//Thread.sleep(5000);
		
	}

}
