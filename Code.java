// to print 1245

public class Code {
    public static void main(String[] args) {
        int x=1;
       while(x<=5){
           if(x==3){
               x++;
               continue;
           }
           System.out.println(x);
           x++;
       }
    }
}
