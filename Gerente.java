public class Gerente extends Funcionario {

    private String projeto;

    public Gerente(String nome, int anoNascimento, double salario, String projeto) {
        super(nome, anoNascimento, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto Gerenciado: " + projeto);
    }

    public void exibirDadosFuncionario(int anoAtual) {
        super.exibirDadosFuncionario(anoAtual);
        informarProjeto();
    }
}

