public class OnetoTwo {
    public static void main(String[] args) {
        int n=5;
        number(n);
    }
    private static void number(int n){
        if(n<1){
            return;
        }
        number(n-1);
        System.out.print(n+" ");


    }
}
