import java.util.ArrayList;

import static java.util.Objects.isNull;

public class GerenciaConta extends Conta {
    private ArrayList<Conta> listaDeContas;

    public GerenciaConta() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(String nome, String cpf, int numero, double saldo) {
        listaDeContas.add(new ContaCorrente(nome, cpf, numero, saldo));

    }

    public void novaContaEspecial(String nome, String cpf, int numero, double saldo, double limite) {
        listaDeContas.add(new ContaEspecial(nome, cpf, numero, limite, limite));

    }

    public void novaContaPoupanca(String nome, String cpf, int numero, double saldo) {
        listaDeContas.add(new ContaPoupanca(nome, cpf, numero, saldo));
    }

    public boolean remove(String cpf) {
        for (Conta conta : listaDeContas) {
            if (conta.getCpf().equalsIgnoreCase(cpf)) {
                listaDeContas.remove(conta);
                return true;
            }
        }
        return false;
    }

    public String listarContas() {
        String saida = "";
        for (Conta conta : listaDeContas) {
            saida += conta.getDados() + "\n";
        }
        return saida;
    }

    public String buscarNome(String nome) {
        for (Conta conta : listaDeContas) {
            if (conta.getNome().equals(nome)) {
                return conta.getDados();
            }
        }
        return "Não encontrado";
    }

    public String buscarCpf(String nome) {
        for (Conta conta : listaDeContas) {
            if (conta.getCpf().equals(nome)) {
                return conta.getDados();
            }
        }
        return "Não encontrado";
    }

    public Conta buscarConta(Integer numeroConta) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public String getDados() {
        return null;
    }

    public boolean fazerDeposito(Integer numeroConta, Double valores) {
        Conta contaSelecionada = this.buscarConta(numeroConta);

        if (!isNull(contaSelecionada)) {
            return contaSelecionada.depositar(valores);
        }

        return false;
    }

    public boolean fazerSaque(Integer numeroConta, Double valores) {
        Conta contaSelecionada = this.buscarConta(numeroConta);

        if (!isNull(contaSelecionada)) {
            return contaSelecionada.depositar(valores);
        }

        return false;

    }

}
