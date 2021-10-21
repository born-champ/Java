
public class BubbleSort {
static void bubblesort(int arr[]) {
    int size = arr.length;
    for(int i =0 ;i<size-1;i++) {
        for(int j =0 ;j<size-1 ;j++) {
            if(arr[j]>arr[j+1]) {
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
int [] data = {-2,45,0,11,-9};
BubbleSort.bubblesort(data);System.out.println(" Sorted array ");
System.out.println(Arrays.toString(data));
    }
}