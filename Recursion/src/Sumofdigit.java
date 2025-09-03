public class Sumofdigit {
    public static void main(String[] args){
        int n=5;
        int ans =sumofDigit(n);
        System.out.println(ans);
    }
    public static int sumofDigit(int n){
        if(n<=1){
            return 1;
        }
        return n+sumofDigit(n-1);
    }
}
