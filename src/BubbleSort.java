import java.util.Arrays;

public class BubbleSort {
     public void sort (int[] arr){
    	 int temp=0;
    	 for(int i = 0;i<arr.length-1;i++)
    		 for(int k =0; k<arr.length-1-i;k++)
    			 if(arr[k]>arr[k+1]){
    				 temp=arr[k+1];
    				 arr[k+1]=arr[k];
    				 arr[k]=temp;
    			 }
     }    
public static void main(String[] args) {
      
	  int[] fff = new int[]{12,4,77,88,22,54,656,76,767,2,8,0,66,35};
      BubbleSort b = new BubbleSort();
		 b.sort(fff);
		 System.out.println(Arrays.toString(fff));
	}
}