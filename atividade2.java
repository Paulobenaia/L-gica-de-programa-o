import java.util.Scanner;
public class atividade2{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int dia;
        System.out.println("digite um numero entre 1 a 7:");
        dia=leia.nextInt();
        switch(dia){
            case 1:
            System.out.println("O dia seleciionado foi domingo:,-)");
            break;
            case 2:
            System.out.println("O dia selecionado foi segunda T-T");
            break;
            case 3:
            System.out.println("O dia selecionado foi terça:-/");
            break;
            case 4:
            System.out.println("O dia selecionado foi quarta");
            break;
            case 5:
            System.out.println("O dia selecionado foi quarta:-x");
            break;
            case 6:
            System.out.println("O dia selecionado foi quinta}:-)");
            break;
            case 7:
            System.out.println("O dia selecionado foi sexta^_^");
            break;  

            default: 
            System.out.println("Esse dia não existe");       
        }

    }
}