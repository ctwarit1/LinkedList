package com.bridgelabz;

public class MyLinkedList <E> implements ILinked <E> {
	
	public int key;
	public ILinked next;
	
	
	
	public MyLinkedList(int key) {
		this.key=key;
		this.next=null;
		
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}

	public ILinked getNext() {
		return next;
	}

	public void setNext(ILinked next) {
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		return "MyLinkedList [key=" + key + ", next=" + next + "]";
	}
}
