import java.util.Scanner;
public class q9td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int numero;
        float valor1;
        float valor2;
        System.out.print("digite o tanto de maças");
        numero=leia.nextInt();
        valor1=(numero*1.30f);
        valor2=(numero*1.00f);
        if(numero>=12){
            System.out.println("o tanto que irá cobrar de maças será:"+valor1);
            }else{
                System.out.println("o tanto que irá cobrar de maças será:"+valor2);
        }
    }
}
