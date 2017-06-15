public class BinarySearch {
	public int searchS(int[] data, int numberToFind){
		    int first = 0;
			int last = data.length-1;
			int midel = data.length/2;
			
			while(true){
				if(first>last)return -1;
				if(data[midel]==numberToFind){
					return midel;
				}
				else if(data[midel]<numberToFind){
					first=midel+1;
					midel= (first + last)/2;
				}
				else {
					last =midel-1;
					midel= (first + last)/2;
				}
			}
	}
	public int searchR(int[] data, int numberToFind, int first, int last){
		
			int midel= (first + last)/2;
			    if(first>last)return -1;
				if(data[midel]==numberToFind)return midel;
				else{
					if(data[midel]<numberToFind)
					   return searchR(data, numberToFind, midel+1, last);
				    else 
					   return searchR(data, numberToFind, first, midel-1);
				}
	}
	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		System.out.println(new BinarySearch().searchR(data, 3, 0, data.length-1));
		System.out.println(new BinarySearch().searchS(data, 3));
	}
}