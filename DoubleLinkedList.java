import java.util.*; 
public class DoubleLinkedList {  
    //Represent a node of the double linked list
    class Node{  
        int data;  
        Node prev;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    //Represent head and tail of the double linked list  
    Node head, tail = null;  

    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
        
        //If list is empty
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //Head's previous will point to null  
            head.prev = null;  
            //tail's next will point to null, as it is the last node of the list 
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode   
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.prev = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null   
            tail.next = null;  
        }  
    }  
    //display() will print out the nodes of the list 
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List are empty");  
            return;  
        }  
        System.out.println("Nodes of double linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.   
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
    public static void main(String[] args) {
        //To implement array in a user input mode  
        DoubleLinkedList  dbList = new DoubleLinkedList ();
        int arr[] = new int [100];  //array, size = 100  
        Scanner sn = new Scanner(System.in);
          
        System.out.print("Enter the size of the array: ");
        int size = sn.nextInt();

        //To add elements in the array
        for(int x = 0; x < size; x++){
            System.out.print("Enter the array values [" + (x+1) + "]: ");
            arr[x] = sn.nextInt();
        }
        for(int x = 0; x < size; x++){
                dbList.addNode(arr[x] );
        }
        
       {
       //Displays the nodes present in the list  
       dbList.display();
       }
    }  
}