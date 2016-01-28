package com.test.TreeTraversal;

public class BinaryTree {
	Node root = null;

	/**
	 * This method will return Old node is the nodes are Equal
	 * and update it with new value.
	 * Else, it will create a new Node and add it to Tree.
	 * 
	 * @param node
	 * @return
	 */
	public Node addNode(int  node){
		Node newNode = new Node(node,null,null,null);
		
		//First node created.
		if(this.root == null){
			this.root = newNode;
			return this.root;
		}
		
		
		Node temp = root,next;
		Node parent= root;
		
		//Traverse the tree and find the correct spot
		while(temp!=null){
			
			if (temp.compareTo(newNode) == 0){
				//addNode(temp,newNode);
				return temp;
			}
			else if(temp.compareTo(newNode) > 0 ){
				parent = temp;
				temp = temp.left;
			}
			else{
				parent = temp;
				temp = temp.right;
			}
		}
		
		return addNode(parent,newNode);
	}

	private Node addNode(Node parent, Node newNode) {
		
	 if(parent == null)
		 parent = root;
	 return	(parent.compareTo(newNode) > 1) ? (parent.left = newNode) : (parent.right = newNode);
		
	}
	
	public void inOrderTraversal(){
		Node temp = root;
		traverseInorder(temp);
		}

	private void traverseInorder(Node temp) {
		if(temp == null)
			return;
		System.out.println(temp);
		
		if(temp.left !=null)
			traverseInorder(temp.left);
		
		if(temp.right!=null)
			traverseInorder(temp.right);
	  }
		
	}

