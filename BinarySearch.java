public class BinarySearch{
	public static void main(String[] args) {
        // TODO Auto-generated method stub
   int arr[] = {3,6,9,12,15};
   int key = 12 ;
   int arrlength = arr.length;
   binarySearch(arr, 0, key, arrlength);
   
    }
public static void binarySearch(int arr[],int start , int key , int length ) {
    int mid = (start+length)/2;
    while(start <= length) {
        if(arr[mid]<key) {
            start = mid +1 ;
        }else if(arr[mid]==key) {
            System.out.println(" this is my key "+ mid );break;
        }else {
            length = mid-1;
        }mid = (start+ length)/2 ;
        if(start>length) {
            System.out.println(" element found");
        }
    }
}
}