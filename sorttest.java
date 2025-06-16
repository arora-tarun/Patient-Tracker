import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] data = {12, 11, 13, 5, 6};

      
        selectionSort(data);

        System.out.println("After sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
  }
  
  public static void selectionSort(int[] arr){
    
    for( int i=0;i<arr.length;i++){
      int min=i;
      for(int j=0;j<arr.length-1;j++){
        if(arr[min]>arr[j]){
          min =j;
        }
        int temp = arr[min];
        arr[min]= arr[i];
        arr[i]=temp;
      }
    }
  }
}