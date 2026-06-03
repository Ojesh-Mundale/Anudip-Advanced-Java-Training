// Find factorial of a number using recursion

public class factorial {
    public static void main(String[] args){
        int num=5;
        int fact=factorial(num);
        System.out.println("Factorial of is: "+fact);
    }
    public static int factorial(int n){
        if(n>=1){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
}
