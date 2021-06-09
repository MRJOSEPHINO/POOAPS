public class ContaCorrente extends Conta {

   public ContaCorrente() {

   }

   public ContaCorrente(String nome, String cpf, int numero, double saldo) {
      super(nome, cpf, numero, saldo);

   }

   @Override
   public String getDados() {
      return "CONTA CORRENTE  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: " + getNumero()
            + " SALDO: " + getSaldo();
   }

   @Override
   public boolean sacar(double valores) {
      if (getSaldo() >= valores) {
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
