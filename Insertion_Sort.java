import java.util.Scanner;
public class Insertion_Sort{

			//Insertion Function 
            public static void sort(int arr[])
            {
                int n = arr.length;
                    System.out.print("\nSorting Process:\n");
                for (int i = 1; i < n; ++i) {
                    int key = arr[i];
                    int j = i - 1;
        
                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
                    arr[j + 1] = key;
                                
                for (int x = 0; x < n; ++x){
                    System.out.print(arr[x] + " ");}
                    //Print the sorting process
                    System.out.println(" ");
                    }              
            }
        
            //Function to print array
            static void printArray(int arr[])
            {
                System.out.print("\nSorted array list (insertion):  ");
                int n = arr.length;
                for (int i = 0; i < n; ++i)
                    System.out.print(arr[i] + " ");
        
                System.out.println();
            }
        

    public static void main(String[] args){
        //name array: arr, size = 100
         int size;  
	     Scanner sn = new Scanner(System.in);
      
         System.out.print("Enter the size of the array: ");
           size = sn.nextInt();
        //User input to add array elements
        int arr[] = new int [size];
            for(int x = 0; x < size; x++){
             System.out.print("Enter the array values [" + (x+1) + "]: ");
             arr[x] = sn.nextInt();
        }
             System.out.print("\nUnsorted array: ");
             for(int x = 0; x < size; x++)
        
             System.out.print(arr[x] + " ");
        
        Insertion_Sort ob = new Insertion_Sort();
        Insertion_Sort.sort(arr);
  
        printArray(arr);
        }
}