import java.util.Scanner;
public class q13td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int valor1;
        int valor2;
        int valor3;
        int maior;
        System.out.println("digite o primeiro valor");
        valor1=leia.nextInt();
        System.out.println("digite o segundo valor");
        valor2=leia.nextInt();
        System.out.println("digite o terceiro valor");
        valor3=leia.nextInt();
        if(valor1>valor2){
        if(valor1>valor3){
            maior=valor1;

        }
        else{
            maior=valor3;

        }
    }
        else if(valor2>valor3){
            maior=valor2;
            }
        else{
            maior=valor3;
        }

        System.out.println("O maior valor é "+maior);
        }
    }