import jave.util.Scanner;
public class Sieve {
    public static void main(String [] args) {
    Scanner in = new Scanner( System.in);
    system.out.print("enter the upper limit of prime number that you want to check");
    int n= in.nextInt();
    boolean[] isPrime =new boolean [n+1];
    for (int i=0; i<=n;i++){
        isPrime[i]=true;
        isPrime[0]=false;
        isPrime[1]=false;
    for(int p=2;p*p<= n;p++){
        if (isPrime[p]){
            for( int m= p*p; m<=n;m+=p){
                isPrime[p]= false;
            }
        }  
    }
    for (int i=2;i<=n;i++){
        if (isPrime[i]) System.out.println(i);
    }
  }
}