import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {


        System.out.println(fiban1()+" "+fiban2());
    }
    private static int fiban1(){
        Scanner n  = new Scanner(System.in);
        int a  = n.nextInt();
       int fib[]= new int[a+1];
        if(a==1) return 1;
        fib[1]=1;
       for (int i=1; i<fib.length-1; i++){
          fib[i+1]=fib[i]+fib[i-1];

       }
        return fib[a];

    }

    private static int fiban2(){
        Scanner n  = new Scanner(System.in);
        int a  = n.nextInt();
        int fib[]= new int[a+1];
        if(a==1) return 1;
        fib[1]=1;
        for (int i=1; i<fib.length-1; i++){
            fib[i+1]=(fib[i]%10+fib[i-1]%10)%10;

        }
        return fib[a];

    }


}
