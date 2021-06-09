import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();

        int menu, numero ;
        double saldo, limite, valores ;
        String nome, cpf ;
        Integer numeroConta = null;

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("|  S I S T E M A  D E  G E R E N C I A M E N T O  |");
            System.out.println("-----------------------------------------------");
            System.out.println("           |  OLA, COMO PODEMOS TE AJUDAR?   | ");
            System.out.println("-----------------------------------------------");
            System.out.println("|      1 - ADICIONAR NOVA CONTA CORRENTE      |");
            System.out.println("|      2 - ADICIONAR NOVA CONTA ESPECIAL      |");
            System.out.println("|      3 - ADICIONAR NOVA CONTA POUPANÇA      |");
            System.out.println("|      4 - REMOVER CONTA                      |");
            System.out.println("|      5 - LISTAR CONTAS                      |");
            System.out.println("|      6 - BUSCAR POR NOME                    |");
            System.out.println("|      7 - BUSCAR POR CPF                     |");
            System.out.println("|      8 - FAZER SAQUE                        |");
            System.out.println("|      9 - FAZER DEPÓSITO                     |");
            System.out.println("|     10 - TERMINAR PROGRAMA                  |");
            System.out.println("-----------------------------------------------");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("NOME DO CLIENTE:");
                    nome = sc.nextLine();
                    System.out.println("CPF:");
                    cpf = sc.nextLine();
                    System.out.println("NÚMERO DA CONTA:");
                    numero = Integer.parseInt(sc.nextLine());
                    System.out.println("VALOR DO SALDO:");
                    saldo = Double.parseDouble(sc.nextLine());
                    contas.novaContaCorrente(nome, cpf, numero, saldo);
                    break;

                case 2:
                    System.out.println("NOME DO CLIENTE:");
                    nome = sc.nextLine();
                    System.out.println("CPF:");
                    cpf = sc.nextLine();
                    System.out.println("NÚMERO DA CONTA:");
                    numero = Integer.parseInt(sc.nextLine());
                    System.out.println("VALOR DO SALDO:");
                    saldo = Double.parseDouble(sc.nextLine());
                    System.out.println("LIMITE DA CONTA");
                    limite = Double.parseDouble(sc.nextLine());
                    contas.novaContaEspecial(nome, cpf, numero, saldo, limite);
                    break;

                case 3:
                    System.out.println("NOME DO CLIENTE:");
                    nome = sc.nextLine();
                    System.out.println("CPF:");
                    cpf = sc.nextLine();
                    System.out.println("NÚMERO DA CONTA:");
                    numero = Integer.parseInt(sc.nextLine());
                    System.out.println("VALOR DO SALDO:");
                    saldo = Double.parseDouble(sc.nextLine());
                    contas.novaContaPoupanca(nome, cpf, numero, saldo);
                    break;

                case 4:
                    System.out.println("QUAL O CPF REMOVER?");
                    cpf = sc.nextLine();
                    System.out.println(contas.remove(cpf));
                    break;

                case 5:
                    System.out.println(contas.listarContas());
                    break;

                case 6:
                    System.out.println("INFORME O NOME DO CLIENTE PARA PESQUISA:");
                    nome = sc.nextLine();
                    System.out.println(contas.buscarNome(nome));
                    break;
                // BUSCAR POR NOME

                case 7:
                    System.out.println("QUAL O CPF A SER PESQUISADO:");
                    cpf = sc.nextLine();
                    System.out.println(contas.buscarCpf(cpf));
                    break;
                // BUSCAR POR CPF

                case 8:
                    System.out.println("DIGITE O NUMERO DA SUA CONTA: ");
                    numeroConta = sc.nextInt();

                    System.out.println("DIGITE O VALOR QUE DESEJA SACAR: ");
                    valores = sc.nextDouble();

                    if (contas.fazerSaque(numeroConta, valores)) {
                        System.out.println("SAQUE NO VALOR DE: " + valores + " EFETUADO COM SUCESSO!");
                    } else {
                        System.out.println("SAQUE NÃO PERMITIDO, PARA MAIORES INFORMAÇÕES CONTATE-NOS");
                    }

                    break;

                case 9:
                    System.out.println("DIGITE O NUMERO DA SUA CONTA: ");
                    numeroConta = sc.nextInt();

                    System.out.println("DIGITE O VALOR QUE DESEJA DEPOSITAR: ");
                    valores = sc.nextDouble();

                    if (contas.fazerDeposito(numeroConta, valores)) {
                        System.out.println("FOI REALIZADO UM DEPOSITO DE: " + valores
                                + "NA SUA CONTA. LEMBRE-SE DE INVESTIR SEMPRE!!!");
                    } else {
                        System.out.println("ALGO DEU ERRADO PARA EFETUAR O DEPOSITO NA CONTA:  "
                                + numeroConta + "VERIFIQUE SE O CPF ESTA CORRETO.");
                    }
                    break;

                default:
                    System.out.println();
                    break;

            }

        } while (menu != 9);
        sc.close();

    }
}
