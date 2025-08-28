public class TriangularSum {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int ans=triangularSum(arr);
        System.out.println(ans);
    }
    private static int triangularSum(int[] arr){
        if(arr.length==1) return arr[0];
        int[] temp=new int[arr.length-1];
        for (int i = 0; i < temp.length; i++) {
            int x=arr[i]+arr[i+1];
            if(x<10){
                temp[i]=x;
            }else{
                int y=x%10;
                temp[i]=y;
            }
        }
        return triangularSum(temp);
    }
}
