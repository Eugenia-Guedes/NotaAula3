public class Animal {

    protected String nome;
    protected String raca;

    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

