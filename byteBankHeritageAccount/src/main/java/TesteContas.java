public class TesteContas {
    public static void main(String[] args) {

        //ContaCorrente cc = new ContaCorrente();
        //cc.deposita(100.0);

       // ContaPoupança cp = new ContaPoupança();
        //cp.deposita(100.0);

        ContaCorrente cc = new ContaCorrente(122,111);
        cc.deposita(100.0);

        ContaPoupança cp = new ContaPoupança(115,125);
        cp.deposita(100.0);

        cc.transfere(10.0,cp);
        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());
    }
}
