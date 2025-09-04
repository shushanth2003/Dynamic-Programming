public class PassingNumber {
    public static void main(String[] args){
        int n=5;
        pass(n);
    }
    static void pass(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pass(--n);
    }
}
