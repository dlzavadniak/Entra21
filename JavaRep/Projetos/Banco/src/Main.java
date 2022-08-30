public class Main {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        Banco p2 = new Banco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(150);
        p2.sacar(200);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}