import java.util.*;

public class queue {

    public static void main(String[] args) {
    //implement queue with a user input feature list of the elements
    Queue<Integer> q_list = new LinkedList<>();
    int arr[] = new int [100]; 
   
    Scanner sn = new Scanner(System.in);

    System.out.print("Enter the size the array: ");
        int size = sn.nextInt();
         //adding elements in queue
        for(int qt = 0; qt < size; qt++){
            System.out.print("Enter the Elements in Queue [" + (qt+1) + "]: ");
            arr[qt] = sn.nextInt();
        }

        //process to insert queue element
         for (int wall = 0; wall < size; wall++) {
               q_list.offer(arr[wall] );
            System.out.println("Queue: " + q_list);
            System.out.println();
            }

        //display and process of removing/deleting element from the queue
         int remove = q_list.poll();
            System.out.println("Removed Element: " + remove);
            System.out.println("Queue after deletion: " + q_list);
    }
}