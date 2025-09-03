public class SeparatedigitNumber {
    public static void main(String[] args){
        int n=12345;
        int res=separateDigitNumber(n);
        System.out.print(res);
    }
    public static int separateDigitNumber(int n){
        if(n<=1) {
            return 1;
        }
        return n%10+separateDigitNumber(n/10);
    }
}
