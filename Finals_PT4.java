import java.util.*;

class Node{
    int Elem;
    Node Lft, Rght;

    public Node (int key){
        Elem = key;
        Lft = Rght = null;
    }
}
class Finals_PT4 {
    Node root;

    Finals_PT4 (){
        root = null;
    }
    //create a void function (In-order, Pre-order, Post-order)
    void PostOrder(Node node){

        if(node == null)
        return;

        PostOrder(node.Lft);
        PostOrder(node.Rght);
        System.out.print(node.Elem+" -> ");
    }
    void InOrder(Node node){
        if(node == null)
        return;

        InOrder(node.Lft);
        System.out.print(node.Elem+" -> ");
        InOrder(node.Rght);
    }
    void PreOrder(Node node){
        if(node == null)
        return;

        System.out.print(node.Elem+" -> ");
        PreOrder(node.Lft);
        PreOrder(node.Rght);
    }

    // function to pause and input another value
    public static void pause() {
    System.out.println("\n<< Press ENTER to continue >>");
    Scanner s = new Scanner(System.in);
    s.nextLine();
}

    // start of the main function
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        Finals_PT4 tree = new Finals_PT4();

        //User input
        System.out.print("Enter the Root node value: ");
        int rootn = sn.nextInt();
        tree.root = new Node(rootn);

        int leftn;
        do{
        leftn = 0;
        pause();
        System.out.print("Enter the node value (Left child): ");
        leftn = sn.nextInt();
        tree.root.Lft = new Node(leftn);
        if(leftn>=rootn){
            System.out.println("\nTry another input! It must be less than the root. . . ("+rootn+")");
        }
        }while(leftn>=rootn);

        int rightn; 
        do{
            rightn = 0;
            pause();
            System.out.print("Enter the node value (Right child): ");
            rightn = sn.nextInt();
            tree.root.Rght = new Node(rightn);
            if(rightn<=rootn){
                System.out.println("\nTry another input! It must be greater than the root. . . ("+rootn+")");
            }

        }while(rightn<=rootn);

        int LSLleaf;//left subtree leaf node(left)
        do{
            LSLleaf = 0;
            pause();
            System.out.print("Enter the node value (Left subtree leaf node(left): ");
            LSLleaf = sn.nextInt();
            tree.root.Lft.Lft = new Node(LSLleaf);
            if(LSLleaf>=leftn){
                System.out.println("\nTry another input! It must be less than parent node. . . ("+leftn+")");
            }

        }while(LSLleaf>=leftn);

        int LSRleaf;//left subtree leaf node(right)
        do{
            LSRleaf = 0;
            pause();
            System.out.print("Enter the node value (Left subtree leaf node(right): ");
            LSRleaf = sn.nextInt();
            tree.root.Lft.Rght = new Node(LSRleaf);
            if(LSRleaf<=leftn){
                System.out.println("\nTry another input! It must be greater than the parent node. . . ("+leftn+")");
            }

        }while(LSRleaf<=leftn);

        int RSLeftleaf;
        //right subtree leaf node (left)
        do{
            RSLeftleaf = 0;
            pause();
            System.out.print("Enter the node value (Right subtree leaf node(left): ");
            RSLeftleaf = sn.nextInt();
            tree.root.Rght.Lft = new Node(RSLeftleaf);
            if(RSLeftleaf>=rightn){
                System.out.println("\nTry another input! It must be less than parent node. . . ("+rightn+")");
            }

        }while(RSLeftleaf>=rightn);

        int RSRightleaf;
        //right subtree leaf node (right)
        do{
            RSRightleaf = 0;
            pause();
            System.out.print("Enter the node value (Right subtree leaf node(right): ");
            RSRightleaf = sn.nextInt();
            tree.root.Rght.Rght = new Node(RSRightleaf);
            if(RSRightleaf<=rightn){
                System.out.println("\nTry another input! It must be greater than the parent node. . . ("+rightn+")");
            }

        //do-while function for the choices in binary traversal implementation
        }while(RSRightleaf<=rightn);

        pause();

        int Choice;//menu input

        do{

            System.out.print("\n | Binary Tree Traversal |");
            System.out.print("\n     in Data Structure    ");
            System.out.print("\n -------------------------");
            System.out.println("\n[1] In-order Traversal");
            System.out.println("[2] Pre-order Traversal ");
            System.out.println("[3] Post-order Traversal");
            System.out.println("[0] Exit");
            System.out.print("\n -----------------------");

            System.out.print("\n     Select option: ");
            System.out.print("\n     >>    ");
            Choice = sn.nextInt();

            switch(Choice){
                case 1:{
                    System.out.print("Display the nodes of the Binary Tree(via In-order Traversal):  ");
                    tree.InOrder(tree.root);
                    pause();
                    break;
                }
                case 2:{
                    System.out.print("Display the nodes of the Binary Tree(via Pre-order Traversal): ");
                    tree.PreOrder(tree.root);
                    pause();
                    break;
                }
                case 3:{
                    System.out.print("Display the nodes of the Binary Tree(via Post-order Traversal): ");
                    tree.PostOrder(tree.root);
                    pause();
                    break;
                }
                case 0:{
                    System.out.print("Exit Program . . .");
                    pause();
                    return;
                }
                default:{
                    System.out.println("Wrong Input!");
                    pause();
                }
            }

        }while(true);

    }
}
