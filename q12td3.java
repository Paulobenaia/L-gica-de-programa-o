import java.util.Scanner;
public class q12td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int valor1;
        int valor2;
        System.out.println("digite o primeiro valor");
        valor1=leia.nextInt();
        System.out.println("digite o segundo valor");
        valor2=leia.nextInt();
        if(valor1>valor2){
            System.out.println("Esse valor vem em primeiro:"+valor1);
            System.out.println("Esse valor vem em segundo:"+valor2);
        }else{
            System.out.println("Esse valor vem em primeiro:"+valor2);
            System.out.println("Esse valor vem em segundo:"+valor1);
        }

    }
}