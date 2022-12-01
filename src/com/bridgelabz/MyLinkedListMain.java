package com.bridgelabz;

public class MyLinkedListMain {
	
	
//	main method
	public static void main(String[] args){
		
		MyLinkedList <Integer> fnode = new MyLinkedList (70);
		MyLinkedList <Integer> snode = new MyLinkedList (30);
		MyLinkedList <Integer> tnode = new MyLinkedList (56);
		
//		creating object for MyLinkedListMethods
		MyLinkedListMethods nodeList = new MyLinkedListMethods();
		
		nodeList.create(fnode);
		nodeList.create(snode);
		nodeList.create(tnode);
		
//		calling display method
		nodeList.showList();
	}

}
