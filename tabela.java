import java.util.Scanner;
public class tabela{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int codigo;
        float valor;
        float copia;
        float total;
        float pago;
        System.out.println("digite o seu código:");
        codigo=leia.nextInt();
        System.out.println("digite a quantia de cópias:");
        copia=leia.nextInt();
        System.out.println("digite a quantia total:");
        total=leia.nextInt();
        switch(codigo){
            case 10:
            valor=copia*1.50f;
            if(total>valor){
            System.out.println("O  aluno pagará:"+(copia*1.50));
            System.out.println("O troco do aluno é:"+(total-(copia*1.50)));
        }else{
            System.out.println("Falta dinheiro");
        }
        break;
            case 20:
            valor=copia*0.80f;
            if(total>valor){
            System.out.println("O funcionario pagará:"+(copia*0.80));
            System.out.println("O troco do funcionário é:"+(total-(copia*0.80)));
        }else{
            System.out.println("Falta dinheiro");
        }
            break;
            case 30:
            valor=copia*0.60f;
            if(total>valor){
            System.out.println("O professor pagará:"+(copia*0.60));
            System.out.println("O troco do professor é:"+(total-(copia*0.60)));
        }else{
            System.out.println("Falta dinheiro");
        }
            break;
            case 40:
            valor=copia*2.00f;
            if(total>valor){
            System.out.println("O não aluno pagará:"+(copia*2.00));
            System.out.println("O troco do não aluno é:"+(total-(copia*2.00)));
        }else{
            System.out.println("Falta dinheiro");
        }
            break;
            default:
            System.out.println("Essa operação não existe =_=");
        }
    }
}
