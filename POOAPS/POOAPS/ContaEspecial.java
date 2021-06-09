public class ContaEspecial extends Conta {
    // A ​ContaEspecial​ possui um limite que permite fazer saques se o saldo mais o
    // limite da conta cobrir o valor pretendido de saque.
    private double limite;
    public ContaEspecial(String nome, String cpf, int numero, double saldo,double limite) {
        super(nome, cpf, numero, saldo);
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public String getDados() {
        return "CONTA ESPECIAL  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: "
                + getNumero() + " SALDO: " + getSaldo() + "LIMITE: " + limite;
    }
    @Override
    public boolean sacar(double valores) {
        if (getSaldo() >= (valores + getLimite())) {
            setSaldo(getSaldo() - valores);

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
