import java.util.Arrays;

public class SelectSort {
	  public void sort (int[] arr){
		     int temp=0;
	    	 int minE=0;
	    	 for(int i = 0;i<arr.length-1;i++){
	    		 minE=i;   
	    		 for(int k=i+1; k<arr.length;k++){
	    			 if(arr[k]<arr[minE])
	    				 minE = k;
	    		 }
	    		temp=arr[i];
	    		arr[i]=arr[minE];
	    		arr[minE]=temp;
	    	 }
	     }
public static void main(String[] args) {
	     
	int[] fff = new int[]{12,4,77,88,22,54,656,76,767,2,8,0,66,35};
	      SelectSort b = new SelectSort();
		  b.sort(fff);
		  System.out.println(Arrays.toString(fff));
		}
	}