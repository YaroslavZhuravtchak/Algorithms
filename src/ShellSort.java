import java.util.Arrays;

public class ShellSort {
	 public void sort (int[] array){
		  int length = array.length;
		  int h = (int)(length/(2.2));
		  int temp;
		  int k;
		  while(h>=1){
	    	 for(int i = h;i<array.length;i+=h){
	    		 temp=array[i];
	    		 
	    		 for( k=i-h;k>=0&&temp<array[k];k-=h)
	    			    array[k+h]=array[k];	 
	    		          
	    	 array[k+h]=temp;
	    	 }
	    	 h=h/2;
		  }
	     }	        
	public static void main(String[] args) {
		  int[] fff = new int[]{1,12,4,4,77,88,22,54,656,150,760,755,6,767,2,8,0,66,35};
		  ShellSort b = new ShellSort();
			 b.sort(fff);
			 System.out.println(Arrays.toString(fff));
		}
	}