//PROGRAM TO FIND COMMON ELEMETS IN ARRAY

package basic_programs;

public class Common_elements_array {

	int commonElement(int a[], int len1, int b[],int len2) {
	 
	   int i,j;
	 
	   for(i = 0; i < len1 ;i++) {
	 
	      for(j = 0; j < len2 ;j++) {
	 
	        if(a[i] == b[j]){
	 
	          System.out.println("common elements in array is="+a[i]);
	          }
	       }
	    }
	return i; 
	}

public static void main(String args[]) {
	

	 
	   int a[] = {2,3,8,5,6};
	   int b[] = {2,6,7,8,10};
	 
	 
	   int len1 = 5;
	   int len2 = 5;
	 
	   commonElement(a,len1,b,len2);
	 
	  

}
	}
