package com.test;

import java.util.function.BinaryOperator;

import com.test.TreeTraversal.BinaryTree;

public class MainClass {
	
	private static class MyThread extends Thread {
		
		public void run(){
			System.out.println("");
		}
		
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		for(int i =0; i < 20; i++){
			 tree.addNode(i);
		}
		
		tree.inOrderTraversal();
		
	}

}
