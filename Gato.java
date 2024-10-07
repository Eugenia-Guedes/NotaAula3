public class Gato extends Animal {

    public Gato() {
        super(); // Chama o construtor da classe mãe
    }

    public Gato(String nome) {
        super(nome); // Chama o construtor da classe mãe que aceita o nome
    }

    public void mia() {
        System.out.println(nome + " está miando: Miau!");
    }
}
