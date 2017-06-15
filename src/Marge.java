import java.util.Arrays;

public class Marge {
    public void marge(int[] arr, int lowPtr, int highPtr, int upperBound){
    	int[] arrsum= new int[upperBound-lowPtr+1];
    	int j = 0;
    	int lowerBound = lowPtr;
    	int mid = highPtr-1;
    	int n = upperBound-lowerBound+1;
    	
    	while(lowPtr <= mid && highPtr <= upperBound)
    		if( arr[lowPtr] < arr[highPtr] )
    			arrsum[j++] = arr[lowPtr++];
    		else 
    			arrsum[j++] = arr[highPtr++];
    		while(lowPtr <= mid)
    			arrsum[j++] = arr[lowPtr++];
    			while(highPtr <= upperBound)
    				arrsum[j++] = arr[highPtr++];
    			for(j=0; j<n; j++)
    				arr[lowerBound+j] = arrsum[j];
    			}
    public void margesort(int[] arr){
    	margesortAdd(arr, 0, arr.length-1);
    }
    public void margesortAdd(int[] arr, int first, int last){
    	if(first==last)return;
    	else{
    		int mid=(first+last)/2;
    		margesortAdd(arr,first,mid);
    		margesortAdd(arr,mid+1,last);
    		marge(arr, first, mid+1,last);
    	}
    }
	public static void main(String[] args) {
		int[] a1= new int[]{7,99,0,533,987,55,8655,9,9,90,45};
		new Marge().margesort(a1);
		System.out.println(Arrays.toString(a1));
	}
}