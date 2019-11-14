class Node  
{ 
    int data; 
    Node left, right; 
       
    Node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 
   
public class BinaryTree  
{ 
    Node root; 

   
    void Display(Node node)  
    { 
        int h = height(node);
      	
         
        for (int i = h; i >= 1; i--)  
        
        { 
            printLevel(node, i); 
        } 
    } 
   
  
  
    void printLevel(Node node, int level)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1)  
        { 
            printLevel(node.right, level - 1); 
            printLevel(node.left, level - 1); 
        } 
    } 
   
   
    int height(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            
            int leftheight = height(node.left); 
            int rightheight = height(node.right); 
   
          
            if (leftheight > rightheight) 
                return (leftheight + 1); 
            else
                return (rightheight + 1); 
        } 
    } 
   
    public static void main(String args[])  
    { 
        BinaryTree tree = new BinaryTree(); 
   
      
        tree.root = new Node(40); 
        tree.root.left = new Node(30); 
        tree.root.right = new Node(70); 
        tree.root.left.left = new Node(20); 
        tree.root.left.right = new Node(35); 
		tree.root.right.left = new Node(50);
		tree.root.right.right= new Node(80);
		           
   
           
        System.out.println("Reverse Order  : "); 
        tree.Display(tree.root); 
    } 
} 
   