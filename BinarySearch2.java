public class BinarySearch2 {
  int binarySearch( int arr[] , int x , int low , int high ) {
      if(high >= low ) {
          int mid=low+(high -low) /2;
          if(arr[mid]==x) // found at mid 
              return mid;
          if(arr[mid]>x) // search the left half 
              return binarySearch(arr, x , low , mid-1);
          return binarySearch(arr, x, mid+1, high);//right half 
      }return -1 ;
  }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     BinarySearch ob = new BinarySearch();
     int arr[] = {3,4,5,6,7,8,9};
     int n = arr.length ;
     int x = 4 ; 
     int result = ob.binarySearch(arr, x,0, n-1);
             if(result ==-1) {
                 System.out.println(" not found");
             }else {
                 System.out.println("  Found");
             }
    }
}
