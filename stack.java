import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> my_stack = new Stack <> ();
        //implement stack with user input 
        int arr[] = new int [100]; 
        boolean check = my_stack.empty();
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sn.nextInt();
       //add the elements in stack
        for(int x = 0; x < size; x++){
            System.out.print("Enter the Elements in Stack [" + (x+1) + "]: ");
            arr[x] = sn.nextInt();
        }
       //display/check the elements in stack
        System.out.print("Is the stack empty?" + check);
        System.out.println();
        for (int x = 0; x < size; x++) {
            my_stack.push(arr[x] + " ");
        }

        System.out.println("Elements in stack" + my_stack);
        check = my_stack.empty();  
    }

    }
