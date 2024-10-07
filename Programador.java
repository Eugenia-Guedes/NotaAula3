public class Programador extends Funcionario {

    private String linguagem;

    public Programador(String nome, int anoNascimento, double salario, String linguagem) {
        super(nome, anoNascimento, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Linguagem de Programação: " + linguagem);
    }

    public void exibirDadosFuncionario(int anoAtual) {
        super.exibirDadosFuncionario(anoAtual);
        informarLinguagem();
    }
}

