import java.util.Scanner;

public class IfElseEncadeado {
    
    public static void main(String... args) {
        long nota;
        //Scanner leitor;
        //leitor = new Scanner(System.in);
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite uma nota: ");
        nota = leitor.nextLong();
        if(nota >= 90){
            System.out.println("Aprovado!");
            System.out.println("Conceito A");
        }
        else if (nota >= 80)
            System.out.printf("Conceito %s\n", "B");
        else 
            System.out.println("Conceito R");
    }

}
