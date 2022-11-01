import java.util.Scanner;
public class q8td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
    float numero;
    System.out.println("digite o valor:");
    numero=leia.nextFloat();
    if(numero>0){
        System.out.println("o numero é positivo");
        }else{
            System.out.println("o numero é negativo");
      }
    }
}