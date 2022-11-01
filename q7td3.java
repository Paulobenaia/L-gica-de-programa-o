import java.util.Scanner;
public class q7td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int numero;
        System.out.println("digite um numero:");
        numero=leia.nextInt();
        if(numero>10){
        System.out.println("o numero é maior que 10");
        }else{
            System.out.println("o numero é menor que 10");
        }
    }
}
