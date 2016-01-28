package com.test.TreeTraversal;

public class Node implements Comparable {

	private int value;
	
	public Node left=null,right=null,parent;
	
	Node(int value, Node left,Node right,Node parent){
		this.value = value;
		this.left = left;
		this.right =  right;
		this.parent = parent;
	}

	@Override
	public int compareTo(Object o) {
		if(o == null)
		   return 0;
		
		Node data = (Node)o;
		if(value > data.value)
			return 1;
		else if(value == data.value)
		    return 0;
		else if(value < data.value)
			return -1;
			
		return 0;
	}
	
	public String toString(){
		return value+"";
	}
}
