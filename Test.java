/* This class file was used only to test the BinarySearchTree.java class. This is not a 
part of BookShop application */

import java.util.*;

class Test
{
	public static void main(String[] args) 
	{	 
	        BinarySearchTree bst = new BinarySearchTree();	
			
			// Insert book data
	        bst.insert(new Book("K","","",101));	 
	        bst.insert(new Book("E","","",102));	 
	        bst.insert(new Book("S","","",103));	 
	        bst.insert(new Book("B","","",104));	 
	        bst.insert(new Book("G","","",105));	 
	        bst.insert(new Book("Q","","",106));        
	        bst.insert(new Book("V","","",107));	 
			bst.insert(new Book("A","","",108));	 
	        bst.insert(new Book("C","","",109)); 
	        bst.insert(new Book("F","","",110)); 
	        bst.insert(new Book("I","","",111)); 
	        bst.insert(new Book("Java SE","","",1110)); 
	        bst.insert(new Book("Java EE","","",1111)); 
	        bst.insert(new Book("Java ME","","",1112)); 
	        bst.insert(new Book("Java 00","","",1113)); 
	        bst.insert(new Book("P","","",112)); 
	        bst.insert(new Book("R","","",113)); 
	        bst.insert(new Book("T","","",114)); 
	        bst.insert(new Book("W1","","",1150)); 
	        bst.insert(new Book("W2","","",1151)); 
	        bst.insert(new Book("W3","","",1152)); 
	        bst.insert(new Book("W4","","",1153)); 
	        bst.insert(new Book("W6","","",1154)); 			
	        bst.insert(new Book("D","","",116)); 
	        bst.insert(new Book("H","","",117)); 
	        bst.insert(new Book("M","","",118)); 
	        bst.insert(new Book("U","","",119)); 
	        bst.insert(new Book("L","","",120)); 
	        bst.insert(new Book("N","","",121)); 
	        
			
			// Removing elements...
			
			//System.out.println("Status: " + bst.remove("G"));
			//System.out.println("Status: " + bst.remove("E"));
			//System.out.println("Status: " + bst.remove("B"));
			//System.out.println("Status: " + bst.remove("A"));
			//System.out.println("Status: " + bst.remove("C"));
			//System.out.println("Status: " + bst.remove("F"));
			//System.out.println("Status: " + bst.remove("I"));
			//System.out.println("Status: " + bst.remove("D"));
			//System.out.println("Status: " + bst.remove("H"));
			System.out.println("Status: " + bst.remove("K"));
			
			
			
			// Check book list with same keyword
			List list = bst.getBookList("Java");
			for(int i = 0;i< list.size(); i++)
			{
				Book bk = (Book)list.get(i);
				System.out.println(bk.title + " ,");			
			}
			
			// Check each node with its left and right children
			// After removing 'K' root, 'L' should be the root of tree. Then the left node must be 'E' and 
			//the right node must be 'S' of node 'L'
			Node node = search("L");		
			System.out.println();
			try
			{
				System.out.println(node.book.author_fname + "");
			}
			catch(Exception e){}
			try
			{
				System.out.println("Left Node: " + node.left.book.title);
			}
			catch(Exception e){}
			try
			{
				System.out.println("Right Node: " + node.right.book.title);
			}
			catch(Exception e){}
			
	 
	}
}