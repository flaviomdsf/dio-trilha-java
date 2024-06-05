import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Invocando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Variáveis sugeridas no Desafio
        int NumeroConta = 1021;
        String NumeroAgencia = "0678";
        String NomeCliente = "Flavio Mendes";
        float saldo = 237.48f;

        //Recebendo dados de acesso a conta
        System.out.println("Por favor, digite o número da agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        //Validando dados de acesso a conta
        if (NumeroConta == conta && NumeroAgencia == agencia.intern()){
            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + NumeroAgencia +", conta é: " + NumeroConta + " e seu saldo "+ saldo + " já está disponível para saque");
        } else {
            System.out.println("Por gentileza, verificar se o número da agencia foi digitado corretamente!");
        }
        
        //Alterando Nome do Cliente, Agencia ou Saldo
        System.out.println("Deseja realizar alguma operação? por gentileza digite Sim ou Não");
        String operacao = scanner.next();

        if (operacao.intern() == "Sim"){
            System.out.println("Qual operação deseja realizar: Saldo | Alterar Nome | Alterar Agencia");
            String OperacaoInterna = scanner.next();
            if (OperacaoInterna.intern() == "Saldo"){
                System.out.println("Digite o novo valor:");
                float NovoSaldo = scanner.nextFloat();
                saldo = NovoSaldo;
                System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + NumeroAgencia +", conta é: " + NumeroConta + " e seu saldo "+ saldo + " já está disponível para saque");
            }
            if (OperacaoInterna.intern() == "Alterar Nome"){
                System.out.println("Digite seu nome:");
                String NovoNome = scanner.next();
                NomeCliente = NovoNome;
                System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + NumeroAgencia +", conta é: " + NumeroConta + " e seu saldo "+ saldo + " já está disponível para saque");
            }
            if (OperacaoInterna.intern() == "Alterar Agencia"){
                System.out.println("Digite sua agencia:");
                String NovaAgencia = scanner.next();
                NumeroAgencia = NovaAgencia;
                System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + NumeroAgencia +", conta é: " + NumeroConta + " e seu saldo "+ saldo + " já está disponível para saque");
            }
        } else {
            System.out.println("Obrigado por utilizar nossos serviços");

        }
        
    }
}
