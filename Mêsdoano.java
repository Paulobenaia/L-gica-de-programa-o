import java.util.Scanner;
public class Mêsdoano{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int mês;
        System.out.println("digite um numero entre 1 a 12:");
        mês=leia.nextInt();
        switch(mês){
            case 1:
            System.out.println("O mês seleciionado foi janeiro7w7");
            break;
            case 2:
            System.out.println("O mês selecionado foi fevereiro T-T");
            break;
            case 3:
            System.out.println("O mês selecionado foi março:-/");
            break;
            case 4:
            System.out.println("O mês selecionado foi abril");
            break;
            case 5:
            System.out.println("O mês selecionado foi maio :-x");
            break;
            case 6:
            System.out.println("O mês selecionado foi junho }:-)");
            break;
            case 7:
            System.out.println("O mês selecionado foi julho ^_^");
            break; 
            case 8:
            System.out.println("O mês seleciionado foi agosto:,-)");
            break;
            case 9:
            System.out.println("O mês selecionado foi setembro T-T");
            break;
            case 10:
            System.out.println("O mês selecionado foi outubro:-/");
            break;
            case 11:
            System.out.println("O mês selecionado foi novembro");
            break;
            case 12:
            System.out.println("O mês selecionado foi dezembro:-x");
            break; 

            default: 
            System.out.println("Esse mês não existe =_=");       
        }

    }
}