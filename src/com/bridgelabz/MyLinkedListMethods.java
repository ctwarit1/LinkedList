package com.bridgelabz;

public class MyLinkedListMethods {
	
//	variable declaration
	ILinked head;
	ILinked tail;
	
//	parameterized constructor
	public  MyLinkedListMethods() {
		this.head=head;
		this.tail=tail;
	}
	
	
//	method for getting the elements in list
	public void create(ILinked newNode) {
		if(this.head==null) {
			this.head=newNode;
		}
		if(this.tail==null) {
			this.tail=newNode;
		}
		else {
			ILinked tempNode= this.head;
			this.head=newNode;    
			this.head.setNext(tempNode);
		}
		
	}
	
//	method for displaying the linked list
	public void showList() {
		System.out.println(head);
	}

}

