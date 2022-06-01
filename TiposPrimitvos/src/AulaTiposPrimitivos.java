import java.util.Scanner;

public class AulaTiposPrimitivos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno");
        String nome = teclado.nextLine();
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %1f \n", nome, nota);

    }
}
