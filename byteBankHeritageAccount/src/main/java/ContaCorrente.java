public class ContaCorrente extends  Conta{
    public static void main(String[] args) {

    }

    public ContaCorrente(){

    }
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = this.saldo + valor;
    }

    @Override //atalho ctrl+espace
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valor);
    }
}
