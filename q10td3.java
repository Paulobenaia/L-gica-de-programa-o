import java.util.Scanner;
public class q10td3{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float nota1;
        float nota2;
        float media;
        System.out.println("digite a primeira nota");
        nota1=leia.nextInt();
        System.out.println("digite a segunda nota");
        nota2=leia.nextInt();
        media=(nota1+nota2)/2;
        if(media>6){
            System.out.println("o aluno foi aprovado:)");
        }else{
            System.out.println("o aluno não foi aprovado:(");
        }
    }
}
