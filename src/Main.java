public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gabriel");

       ContaCorrente cc = new ContaCorrente(cliente1);
       ContaPoupanca cp = new ContaPoupanca(cliente1);

       cc.imprimirExtrato();
       cp.imprimirExtrato();
    }
}
