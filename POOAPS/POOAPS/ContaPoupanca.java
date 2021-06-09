public class ContaPoupanca extends Conta {

    private double Taxa = 10;

    public ContaPoupanca(String nome, String cpf, int numero, double saldo) {
        super(nome, cpf, numero, saldo);
    }

    public double getTaxa() {
        return Taxa;
    }

    public void setTaxa(double Taxa) {
        this.Taxa = Taxa;
    }

    @Override
    public String getDados() {
        return "CONTA POUPANÇA  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: "
                + getNumero() + " SALDO: " + getSaldo();
    }

    @Override
    public boolean sacar(double valores) {
        if (getSaldo() >= (valores)) {
            setSaldo(getSaldo() - (valores + this.Taxa));
            return true;
        }
        return false;

    }

    @Override
    public boolean depositar(double valores) {
        setSaldo(getSaldo() + valores);

        return true;
    }
}
