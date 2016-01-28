package com.test;

import java.util.concurrent.BlockingQueue;

public class Consumer {
	
 private BlockingQueue<String> queue = null;
	
 public Consumer(BlockingQueue<String> queue){
	 this.queue = queue;	 
 }
	
 public String consume(int i) throws InterruptedException {
	String data = queue.take();
	//Do some processing
	return data+"From Thread :" + i;
 }
 
}
