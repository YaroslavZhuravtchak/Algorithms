import java.util.Arrays;

public class QuickSort {
	int[] arr;
	int temp;
	public QuickSort(int[] arr) {
		this.arr=arr;
	}
	public void swap(int a, int b){
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public int partition(int left, int right, int pivot){
			int leftPointer = left-1;
			int rightPointer = right+1;
			while(true){
			while(right>leftPointer&&arr[++leftPointer]<pivot)
				;
			while(left<rightPointer&&arr[--rightPointer]>=pivot)
				;
			if(leftPointer>=rightPointer) break;
			else swap(leftPointer,rightPointer);
		}
			swap(leftPointer,right);
			return leftPointer;
	}
	public void quickSort(int left, int right){
		if(left>=right) return;
		else{
			int mid = partition(left, right, arr[right]);
			quickSort(left, mid-1);
			quickSort(mid+1, right);
		}
	}
	public static void main(String[] args) {
		 int[] fff = new int[]{100,120,4,4,77,88,220,54,656,150,760,755,6,767,2,8,0,66,35,150};
		 QuickSort b = new QuickSort(fff);
		 b.quickSort(0, fff.length-1);
		 System.out.println(Arrays.toString(fff));
	}
}
