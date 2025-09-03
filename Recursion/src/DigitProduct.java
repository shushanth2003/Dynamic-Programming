public class DigitProduct {
    public static void main(String[] args){
        int n=1342;
        int ans=digitProduct(n);
        System.out.println(ans);
    }
    public static int digitProduct(int n){
        if(n<=1){
            return 1;
        }
        return (n%10)*digitProduct(n/10);
    }
}
