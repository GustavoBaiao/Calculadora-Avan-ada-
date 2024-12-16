
package operacoes;

import historico.Historico;
import  java.util.ArrayList;

public class OperacoesBasicas {

     private Historico historico;
     public OperacoesBasicas(){
         this.historico = new Historico(new ArrayList<>());
     }

     public Historico getHistorico() {
         return this.historico;
     }

    // Classes das operações basicas da matematica
    public double somar(double a, double b) {
        double result = a + b;
        historico.adicionarOperacao("A Soma: " + a + " + " + b + " = " + result);
        return result;
    }

    public double subtrair(double a, double b) {
        double result = a - b;
        historico.adicionarOperacao("A Subtração: " + a + " - " + b + " = " + result);
        return result;
    }

    public double multiplicar(double a, double b) {
        double result = a * b;
        historico.adicionarOperacao("A multiplicação: " + a + " * " + b + " = " + result);
        return result;
    }
    public double dividir(double a, double b) {
        if ( b == 0){
            throw new ArithmeticException("Divisão pro zero não é permitida ");
        }
        double result = a / b;
        historico.adicionarOperacao("A divisão: " + a + " / " + b + " = " + result);
        return result;
    }

    public double potencia(double a, double b) {
        double result = Math.pow(a, b);
        historico.adicionarOperacao("A Potencia: " + a + " com expoente: " + b + " = " + result);
        return result;
    }

    public double valorAbsoluto(double a) {
        double result = Math.abs(a);
        historico.adicionarOperacao("O valor absoluto: " + a + " = " + result);
        return result;
    }

    public double raizQuadrado(double a) {
        if ( a < 0){
           throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        double result = Math.sqrt(a);
        historico.adicionarOperacao("A raiz quadrade de: " + a + " = " + result);
        return result;
    }

    public double raiz(double a, double b){
        if ( a < 0 && b % 2 == 0){
            throw new IllegalArgumentException("Não é possível calcular a raiz de índice par de um número negativo.");
        }
        double result = Math.pow(a, 1/b);
        historico.adicionarOperacao("A raiz quadrade de: " + a + " na base " + b + " = " + result);
        return result;
    }

    public double calcularPorcentagem(double total, double percentual) {
        double result = ( total * percentual ) / 100;
        historico.adicionarOperacao("A porcetagem: " + total + " % " + percentual + " = " + result);
        return  result;
    }

}
