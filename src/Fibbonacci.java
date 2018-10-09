import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("Enter eny number ");
        int fibo = sc.nextInt();
        System.out.println("1 1 ");
        while (a<=fibo){
            a=b+c;
            if (a>=fibo)
                break;;
            System.out.print(a+" ");
            b=c;
            c=a;

        }
    }
}