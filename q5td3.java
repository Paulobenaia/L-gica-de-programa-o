import java.util.Scanner;
public class q5td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float salario;
        float reajuste;
        System.out.println("digite o salario:");
        salario=leia.nextFloat();
        System.out.println("digite o raejuste:");
        reajuste=leia.nextFloat();
        float numero=salario*reajuste/100;
        float se=salario+numero;
        System.out.println("o novo salario é:"+se);
    }
}