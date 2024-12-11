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

    double modulo(double a, double b) {
        return a % b;
    }


}
