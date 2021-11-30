public class ContaPoupança extends Conta{

    public ContaPoupança(){

    }
    public ContaPoupança (int agencia, int numero){
        super(agencia, numero);

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
