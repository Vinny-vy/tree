import java.util.*;

import spiral.Node;
public class odd {
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
Node root=null;
public void printodd(Node root, boolean even)
{
	//odd=true;
	if(root==null)
	{
		return;
	}
	 
	if(odd == false)
	
		System.out.println(root.data);
	
	
	
		printodd(root.left,!even);
		printodd(root.right,!even);
		
	
	
}
void insert(int data)
	{
		root=insert(root,data);
	}
	Node insert(Node root,int data)
	{
		if(root==null)
		{
			root= new Node(data);
			return root;
		}
		else {
		 if (data < root.data) 
	            root.left = insert(root.left, data); 
	        else if (data > root.data) 
	            root.right = insert(root.right, data); 
			
			return root;}
		//}
	}

	public static void main(String args[])
	{
		odd o= new odd();
		o.insert(4);
		o.insert(3);
		o.insert(5);
		o.insert(1);
		o.insert(6);
		o.insert(2);
	    o.printodd(o.root, true);  
	}


}
