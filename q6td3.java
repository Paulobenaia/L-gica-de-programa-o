import java.util.Scanner;
public class q6td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float nota1;
        float nota2;
        float nota3;
        System.out.println("digite a primeira nota:");
        nota1=leia.nextFloat();
        System.out.println("digite a segunda nota:");
        nota2=leia.nextFloat();
        System.out.println("digite a terceira nota:");
        nota3=leia.nextFloat();
        float mediafinal=(nota1*2+nota3*5)/10;
        System.out.println("A media final é:"+mediafinal);
    }
}