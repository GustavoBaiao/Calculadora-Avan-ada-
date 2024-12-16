package operacoes;

public class OperacoesBasicas {

    // Classes das operações basicas da matematica
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if ( b == 0){
            throw new ArithmeticException("Divisão pro zero não é permitida ");
        }
        return a / b;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double valorAbsoluto(double a) {
        return Math.abs(a);
    }

    public double raizQuadrado(double a) {
        if ( a < 0){
           throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(a);
    }

    public double raiz(double a, double b){
        if ( a < 0 && b % 2 == 0){
            throw new IllegalArgumentException("Não é possível calcular a raiz de índice par de um número negativo.");
        }
        return Math.pow(a, 1/b);
    }

    public double calcularPorcentagem(double total, double percentual) {
        return  ( total * percentual ) / 100;
    }

}
