public class Addingsum {
    public static void main(String[] args) {
        int num = 38;
        int ans=addDigits(num);
        System.out.println(ans);
    }
    public static int addDigits(int num) {
        int x=0;
        while(num>0){
            int temp=num%10;
            x+=temp;
            if(x>10){
                num=x;
            }
            num/=10;
        }
        return x;
    }
}
