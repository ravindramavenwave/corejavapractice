package com.test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	
	private CountDownLatch  startCount = new CountDownLatch(10);
	private CountDownLatch  stopCount = new CountDownLatch(1);
	
	public class MyThread extends Thread {
		
		//Single argument constructor
		public MyThread(String name){
			this.setName(name);
		}
		
		//Main Thread
		public void run(){
			
			System.out.println(getName());
			try {
				stopCount.await();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			startCount.countDown();
		}  //End of RUN
	}  
	
	public void startWait() throws InterruptedException{
		startCount.wait();
	}
	
	public void  stopwait() throws InterruptedException{
		stopCount.wait();
	}

	public void  startCountDown() throws InterruptedException{
		startCount.countDown();
	}
	
	public void  stopCountDown() throws InterruptedException{
		stopCount.countDown();
	}

}
