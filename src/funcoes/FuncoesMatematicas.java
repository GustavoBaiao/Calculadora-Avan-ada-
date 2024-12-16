
package funcoes;

import historico.Historico;
import java.util.ArrayList;

public class FuncoesMatematicas {
    private Historico historico;

    public FuncoesMatematicas() {
        this.historico = new Historico(new ArrayList<>());
    }

    public Historico getHistorico() {
        return this.historico;
    }

    public double seno (double angulo){
        double resultado = Math.sin(angulo);
        historico.adicionarOperacao("O seno de: " + angulo + " é: " + resultado);
        return resultado;
    }

    public double cosseno (double angulo){
        double resultado = Math.cos(angulo);
        historico.adicionarOperacao("O cosseno de: " + angulo + " é: " + resultado);
        return resultado;
    }

    public double tangente(double angulo){
        double resultado = Math.tan(angulo);
        historico.adicionarOperacao("A tangente de: " + angulo + " é: " + resultado);
        return resultado;
    }

    public  double log (double valor){
        double resultado = Math.log(valor) / Math.log(2);
        historico.adicionarOperacao("O log de: " + valor +" na base 2 é: " + resultado );
        return resultado;
    }

    public  double fatorial(int n){
        double fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        historico.adicionarOperacao("O fatorial de: " + n + " é: " + fatorial);
        return fatorial;
    }
}
