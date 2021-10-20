import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args) {
		int[] arr = {5,7,9,3,5,2,1,0};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		}

static void bubble(int[] arr){
    boolean isSorted=true;
        for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                isSorted=false;
            }
        }
        if(isSorted) break;
    }
    
}
}
