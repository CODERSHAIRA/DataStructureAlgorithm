package com.kashish.tutorial.adt.stack;

public class Stack {

			private int maxSize;
			private long[] stackArray;
			private int top;
			
			public Stack(int size){
				
				this.maxSize=size;
				this.stackArray= new long[maxSize];
				this.top=-1;
				
			}
			public void push(long j){
				if(isFull()){
					System.out.println("The stack is already Full");
				}
				else{
				top++;
				stackArray[top] =j;
				}
				
			}
			public long pop(){
				if(isEmpty()){
					System.out.println("The stack is already empty");
					return -1;
				}
				else{
				int old_top=top;
				top--;
				return stackArray[old_top];
				}
			}
			public long peek(){
				return stackArray[top];
				
			}
			public boolean isEmpty(){
				return(top==-1);
			}
				public boolean isFull(){
				return(top==maxSize-1);
			}
			
				
			
				
		}
	


