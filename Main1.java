import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        Gerente gerente = new Gerente("João Silva", 1990, 20000.0, "Projeto A");
        System.out.println("\n---- Dados do Gerente ----");
        gerente.exibirDadosFuncionario(anoAtual);

        Programador programador = new Programador("Joana Silva", 1990, 10000.0, "Java");
        System.out.println("\n---- Dados do Programador ----");
        programador.exibirDadosFuncionario(anoAtual);

        scanner.close();
    }
}

