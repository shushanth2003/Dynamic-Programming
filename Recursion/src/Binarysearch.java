import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args){
        int[] arr={1,2,4,66,77,99,100};
        int target=99;
        System.out.println(binary(arr,target,0,arr.length-1));
    }
    public static int binary(int[] arr,int target,int start,int end){
        if(start>end) return -1;
        // middle
        int middle=start+(end-start)/2;
        if(target==arr[middle]) return middle;
        if(target<arr[middle]){
            return binary(arr,target,start,middle-1);
        }
        return binary(arr,target,middle+1,end);
    }
}
