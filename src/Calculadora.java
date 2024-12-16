import funcoes.FuncoesMatematicas;
import operacoes.OperacoesBasicas;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacoesBasicas opBasicas = new OperacoesBasicas();
        FuncoesMatematicas funcoesMat = new FuncoesMatematicas();

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Seno");
            System.out.println("6. Cosseno");
            System.out.println("7. Tangente");
            System.out.println("8. Fatorial");
            System.out.println("9. Histórico");
            System.out.println("10. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 10) {
                System.out.println("Fechando calculadora");
                break;
            }

            double a, b, resultado;
            int n;

            switch (escolha) {
                case 1:
                    System.out.println("Digite dois números: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    resultado = opBasicas.somar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite dois números: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    resultado = opBasicas.subtrair(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Digite dois números: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    resultado = opBasicas.multiplicar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Digite dois números: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    try {
                        resultado = opBasicas.dividir(a, b);
                        System.out.println("Resultado: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Digite o ângulo em radianos: ");
                    a = scanner.nextDouble();
                    resultado = funcoesMat.seno(a);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 6:
                    System.out.println("Digite o ângulo em radianos: ");
                    a = scanner.nextDouble();
                    resultado = funcoesMat.cosseno(a);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 7:
                    System.out.println("Digite o ângulo em radianos: ");
                    a = scanner.nextDouble();
                    resultado = funcoesMat.tangente(a);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 8:
                    System.out.println("Digite um número para calcular o fatorial: ");
                    n = scanner.nextInt();
                    resultado = funcoesMat.fatorial(n);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 9:
                    System.out.println("Histórico de operações:");
                    opBasicas.getHistorico().imprimirOperacoes();
                    funcoesMat.getHistorico().imprimirOperacoes();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
