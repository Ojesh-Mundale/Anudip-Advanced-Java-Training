//  Display numbers containing 5 from 100 to 200 using rem and div , dont use temp variable

public class NumbersContaining5{
    public static void main(String[] args) {
        for(int i=100; i<=200; i++){
            int num=i;
            int rem=0;
            while(num>0){
                rem=num%10;
                if(rem==5){
                    System.out.println(i);
                    break;
                }
                num=num/10;
            }
    }
}
}
