import java.util.Scanner;
public class Bubble_Sort{

    public static void sort(int arr [] ){
        
        //Bubble Sort function 
        int size = arr.length;
        System.out.print("\nSorting Process:\n");
        for (int i=0;i<size-1;++i){

            for(int j=0;j<size-i-1; ++j){

                if(arr[j+1]<arr[j]){

                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    
                }
             
        for(int x = 0; x<size; ++x){
            System.out.print(arr[x] + " ");
        }
            System.out.println(" ");
            }
        }
    }
            //Function to print the array  
            static void printArray(int arr[])
            {
                System.out.print("\nSorted array list (bubble): ");
                int size = arr.length;
                for (int x = 0; x < size; x++)
                    System.out.print(arr[x] + " ");
          
                System.out.println();
            }

    public static void main(String[] args){
        //name array: arr, size = 100
        int size;  
        Scanner sn = new Scanner(System.in);

        //User input to add array elements
            System.out.print("Enter the size of the array: ");
                size = sn.nextInt();
           
        int arr[] = new int [size];
            for(int x = 0; x < size; x++){
            System.out.print("Enter the array values [" + (x+1) + "]: ");
                arr[x] = sn.nextInt();
            }
            System.out.print("\nUnsorted array: ");
            for(int x = 0; x < size; x++)
                    
            System.out.print(arr[x] + " ");
                    
        Bubble_Sort ob = new Bubble_Sort();
        Bubble_Sort.sort(arr);
                  
        printArray(arr);
                
        }
}