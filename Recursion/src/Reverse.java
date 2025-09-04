public class Reverse{
    public static void main(String[] args){
        int res=12345;
        int ans=reverse(res,0);
        System.out.println(ans);
    }
    public static int reverse(int number,int rev){
        if(number==0){
            return rev;
        }
        int temp=(rev*10)+(number%10);
        return reverse(number/10,temp);
    }
}