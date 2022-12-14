package com.tutorial.kashish.ds.circularlinkedlist;

import com.tutorial.kashish.ds.singlylinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
      
	public CircularLinkedList() {
		first =null;
		last =null;
		
	}
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			last=newNode;
		}
		 newNode.next= first;
		 first=newNode;
	}
	public void insertLast(int data) {
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			first=newNode;
		}
		 last.next= newNode;
		 last=newNode;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public int deleteFirst() {
		int temp=first.data;
		if(first.next==null) {
			last=null;
		}
		first=first.next;
		return temp;
	}
	
	 public void displayList() {
		   System.out.println("List(first-->last)");

		   Node current=first;
		   while(current!=null) {
			   current.displayNode();
			   current=current.next;
		   }
		   
	   }

}
