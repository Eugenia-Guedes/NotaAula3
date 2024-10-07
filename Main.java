public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        cachorro.setRaca("Schnauzer");
        System.out.println("Nome: " + cachorro.getNome() + ", Raça: " + cachorro.getRaca());
        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato();
        gato.setNome("Bibi");
        gato.setRaca("Siames");
        System.out.println("\nNome: " + gato.getNome() + ", Raça: " + gato.getRaca());
        gato.caminha();
        gato.mia();

    }
}
