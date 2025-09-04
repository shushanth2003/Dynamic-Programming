public class Palindrome {
    public static void main(String[] args){
        int n=1231;
        int old_rev=n;
        boolean ans=palindrome(n,0,old_rev);
        System.out.println(ans);
    }
    public static boolean palindrome(int n,int rev,int check){

        if(n==0){
            if(check==rev){
                return true;
            }else{
                return false;
            }
        }
        int temp=(rev*10)+(n%10);
        return palindrome(n/10,temp,check);
    }
}
