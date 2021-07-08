//PROGRAM FOR BUBBLE SORT

package basic_programs;

public class Bubble_sort {
	 
	    static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	    public static void main(String[] args) {  
	                int arr[] ={2,50,35,1,30,540};  
	               
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	   
	        }  
	}  


