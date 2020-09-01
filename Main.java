class Binary
{ 

 static class Node {  
    int key;  
     Node left, right;  
} 
static Node newNode(int key)  
{  
    Node temp = new Node();  
    temp.key = key;  
    temp.left = temp.right = null;  
    return (temp);  
}  
  
static boolean skewST(Node root)  
{  
    if (root == null || (root.left == null)  

}  
  

public static void main(String args[]) 
{  

    Node root = newNode(10);  
    root.left = newNode(12);  

}  
} 
