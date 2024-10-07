public class Cachorro extends Animal {

    public Cachorro() {
        super(); // Chama o construtor da classe mãe
    }

    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(nome + " está latindo");
    }
}
