public class Countzero {
    public static void main(String[] args){
        int ans=10000;
        int data=countZero(ans,0);
        System.out.println(data);
    }
    public static int countZero(int number,int count){
        if(number==0){
            return count;
        }
        int temp=number%10;
        if(temp==0){
            count++;
        }
        return countZero(number/10,count);
    }
}
