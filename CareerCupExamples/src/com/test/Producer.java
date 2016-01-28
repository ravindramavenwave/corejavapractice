package com.test;

import java.util.concurrent.BlockingQueue;

public class Producer {
	
	private BlockingQueue<String> queue= null ;
	
	public Producer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	
	public void produce(int i) throws InterruptedException {
		//DO PROCESSING
		queue.put("Helllo World!"+i);;
		
	}

}
