import java.util.Arrays;

public class SumofTriangle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        constructTriangle(arr);
    }
    private static void constructTriangle(int[] a){
        if(a.length<1){
            return;
        }
        int[] temp=new int[a.length-1];
        for (int i = 0; i < temp.length; i++) {
            int x=a[i]+a[i+1];
            temp[i]=x;
        }
        constructTriangle(temp);
        System.out.println(Arrays.toString(a));

    }
}
