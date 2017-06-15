import java.util.Arrays;

public class InsertSort {
	  public void sort (int[] arr){
		  int temp;
		  int k;
	    	 for(int i = 1;i<arr.length;i++){
	    		 temp=arr[i];
	    		 for(k=i-1;k>=0&&temp<arr[k];k--)
	    			    arr[k+1]=arr[k];	 
	   
	    		 arr[k+1]=temp;
	    	 }
	     }	    
	public static void main(String[] args) {
		  int[] fff = new int[]{1,12,4,4,77,88,22,54,656,150,760,755,6,767,2,8,0,66,35};
		  InsertSort b = new InsertSort();
			 b.sort(fff);
			 System.out.println(Arrays.toString(fff));
		}
	}