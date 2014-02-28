/*
This class is used to handle Binary Search Tree operations. 

Class: 	BinarySearchTree
Constructor: Default constructor
Methods:
	public void insert(Book book)
	public Node search(String title)
	public Node search(int ISBN)
	
*/

public class BinarySearchTree
{
	Node root;	// This node is used for Root element
	
	/*Data insertion method to the Binary Search Tree. This method has one parameter 
	to get data of a book and insert it.*/
	public void insert(Book book)
	{	 
	    // Create a new Node and initialize it. Book reference pass to it	 
	    Node node = new Node(book);
	 
	    // If there is no root this node set as root	 
	    if (root == null)	
		{	 
	        root = node;	 
	    }	
		else	
		{	 
			// Start to find correct place for the note. It start from root.
			// Here I used reference 'pointed_node' to point node objects 
	        Node pointed_node = root;	 	        	 
	        Node parent;	// Parent to reffer parent node of a node		
			
			while (true)		
			{    	 
	            parent = pointed_node;	 	// First, I assigned pointed_node to parent. This is first and top node
	            
				// Here, It compare each node by book title which is inserted book title
				/* If book title is less than to the book title of pointed node, node should be 
				placed in a child of left side from parent */
	            if (book.title.compareTo(pointed_node.book.title) < 0)			
				{		 
	                pointed_node = pointed_node.left;	 
	                // Check if the left child is a leaf	 
	                if (pointed_node == null)				
					{	 
	                    // If true, then place the new node on the left of it	 
	                    parent.left = node;
	                    return; // finish
					}	                
				}			
				else			
				{ // If we get here put the node on the right
					pointed_node = pointed_node.right;	 
	                    // Check if the right child is a leaf	 
	                if (pointed_node == null) 
					{	 
	                    // If true, then place the new node on the right of it	 
	                    parent.right = node;
	                    return; // finish	 
	                }	 
	            }	 
	        }
	    }	 
	}
	
	
	/* Data searching method of Binary Search Tree. This method has one parameter to
	get title of a book for searching */
	public Node search(String title) 
	{	 
	    // Begins from the root node. So root node assigned to the pointed_node reference. 
	    Node pointed_node = root;	 
	    
		// Check, more nodes of Binary Search Tree
	    while (pointed_node.book.title != title) 
		{	 
	        // If we should search to the left	 
	        if (title.compareTo(pointed_node.book.title) < 0) 	
			{	 
	            // Shift the pointed Node to the left child	node 
	            pointed_node = pointed_node.left;	 
	        } 	
			else 	
			{	 
	            // Shift the pointed Node to the right child node 
	            pointed_node = pointed_node.right;	 
	        }	 
	        
			// If the node was not found, return null	 
	        if (pointed_node == null)
	            return null;	 
	    }
	    return pointed_node;	 
	}
	
	/* Data searching method of Binary Search Tree. This method has one parameter to
	get isbn number of a book for searching. This is overloaded method to accept ISBN number*/
	public Node search(int isbn) 
	{	 
	    // Begins from the root node. So root node assigned to the pointed_node reference. 
	    Node pointed_node = root;	 
	    // Check, more nodes of Binary Search Tree	 
	    while (pointed_node.book.isbn != isbn) 
		{	 
	        // If we should search to the left	 
	        if (isbn < pointed_node.book.isbn) 	
			{	 
	            // Shift the pointed Node to the left child	node	 
	            pointed_node = pointed_node.left;	 
	        } 	
			else 	
			{	 
	            // Shift the pointed Node to the right child node 
	            pointed_node = pointed_node.right;	 
	        }	 
	        // If the node was not found, return null 
	        if (pointed_node == null)
	            return null;	 
	    }
	    return pointed_node;	 
	}
	
	
	
	/* This method will find the node with minimum value and return it to the caller.
	When it was found node will delete with set it into remove method with recursivly checking.
	This method accept one parameter with node object. */
	protected Node getMinimum(Node node) 
	{		
			if(node.left == null)		// If pointed node has not left child,
			{
				Node b = new Node(node.book);	// Temporarly store node in new object of node with reference 'b'	
				remove(node.book.title);		// call remove method with book title to find and delete it
				return b;						// Return stored data of b
			}
			else if (node.left.left == null)  	// If pointed node has left child and the child has no left child,
			{
				Node b = node.left;				// New referencr 'b' refer to left child of 'node'
				remove(b.book.title);			// call remove method with book title to find and delete it	
				return b;						// Return stored data of b
			}				
		return getMinimum(node.left);	// Recursively find the node minimum value
    }
}