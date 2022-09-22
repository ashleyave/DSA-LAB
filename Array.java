import java.util.Scanner;

public class Array {

    public static void main(String[] args){

        int arr[] = new int [100]; 
        int temp;
        int sum = 0;
        int high, low;
         
        Scanner sn = new Scanner(System.in);
     
        System.out.print("Enter the size of the array: ");
        int size = sn.nextInt();
        
        //insert operation
        for(int x = 0; x < size; x++){
            System.out.print("Enter the array values [" + (x+1) + "]: ");
            arr[x] = sn.nextInt();
        }
        
        //display operation
        System.out.print("\nElements of the unsorted array: ");
        for(int x = 0; x < size; x++){
            System.out.print(arr[x] + " "); 
        }
        //to find the highest and lowest elements of the array 
         high=arr[0];
         low=arr[0];
         for(int x=0; x<size; x++){
           if(low>arr[x]){
             low=arr[x];
           }
           
           if(high<arr[x]){
             high=arr[x];  
           }
        }
        //print the highest and lowest elements of the array
        System.out.print("\nThe lowest element of the array is: "+low);
        System.out.print("\nThe highest element of the array is: "+high);

        //find sum using loop
        for(int x=0; x < size; x++){
        sum=sum+ arr[x];
        }
        
        //display the sum on the screen
        System.out.println("\nSum of the array:"+sum);

        for (int x = 0; x < size; x++) {
            for (int j = x + 1; j < size; j++) {
              if (arr[x] > arr[j]) {
                temp = arr[x];
                arr[x] = arr[j];
                arr[j] = temp;
              }
            }
          }
      
        //print sorted elements 		
        System.out.print("\nAscending Order: ");
        for (int x = 0; x < size; x++) {
            System.out.print(arr[x] + " ");     
        }

        for (int x = 0; x < size; x++) {
          for (int j = x + 1; j < size; j++) {
           if (arr[x] < arr[j]) {
             temp = arr[x];
             arr[x] = arr[j];
             arr[j] = temp;
           }
         }
       }
  
        //print sorted elements 		
        System.out.print("\nDescending Order: ");
        for (int x = 0; x < size; x++) {
            System.out.print(arr[x] + " ");

      }
   }
}
