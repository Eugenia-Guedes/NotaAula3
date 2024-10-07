public class Funcionario {

    protected String nome;
    protected int anoNascimento;
    protected double salario;

    public Funcionario(String nome, int anoNascimento, double salario) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.salario = salario;
    }

    public double informarSalario() {
        return salario;
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

    public void exibirDadosFuncionario(int anoAtual) {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Idade: " + calcularIdade(anoAtual) + " anos");
    }
}
