package com.tutorial.kashish.ds.doublylinkedlist;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
	
		this.first=null;
		this.last=null;
	}
	public boolean isEmpty() {
		return last==null ;
	}
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			 last=newNode;
		}
		else {
			first.previous=newNode;
		}
		newNode.next=first;
		this.first=newNode;
}
	public void insertLast(int data) {
	
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			first=newNode;
		}
		else {
		last.next=newNode;
		newNode.previous=last;
		}
		last=newNode;
		
	}
	public Node deleteFirst() {
	    Node temp=first;
	    if(first.next==null){//only one item present in the list
	    	last=null;
	    }
	    else {
	    	first.next.previous=null;
	    }
	    first=first.next;
		return temp;
	}
	public Node deleteLast() {
		Node temp =last;
		if(first.next==null) {
			first=null;
		}
		else {
			last.previous.next=null;
		}
		last=last.previous;
		return temp;
	}
	public boolean insertAfter(int key,int data) {
		Node current=first;
		while(current.data!=key) {
			current=current.next;
			if(current==null) {
				return false;
			}
		}
		Node newNode =new Node();
		newNode.data=data;
		if(current==last) {
			current.next= newNode;
			newNode.next=null;
			last=newNode;
		}
		else {
			newNode.next=current.next;
			current.next.previous=newNode;
		}
		newNode.previous=current;
		current.next=newNode;
		return true;
	}
	public Node deleteKey(int key) {
		Node current =first;
		while(current.data!=key) {
			current=current.next;
			if(current!=null) {
				return null;
			}
		}
		if(current==first) {
			first=current.next;
		}
		else {
			current.previous.next=current.next;
		}
		return current;
	}
	public void displayList() {
		Node current =first;
		System.out.println("List (First-->Last): ");
		while(current!=null) {
			current.displayNode();
			current=current.next;
		
		}
	}
}
