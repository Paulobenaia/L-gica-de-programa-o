import java.util.Scanner;
public class q11td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int numero;
        int valor1;
        int valor2;
        System.out.println("digite o valor um");
        valor1=leia.nextInt();
        System.out.println("digite o valor dois");
        valor2=leia.nextInt();
        if(valor1>valor2){
            System.out.println("o primeiro valor é maior que o segundo");
            }else{
                System.out.println("o segundo valor é maior que o primeiro");
        }
    }
}
