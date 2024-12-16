package funcoes;

public class FuncoesMatematicas {

    public double seno (double angulo){
        return Math.sin(angulo);
    }

    public double cosseno (double angulo){
        return Math.cos(angulo);
    }

    public double tangente(double angulo){
        return Math.tan(angulo);
    }

    public  double log (double valor){
        return Math.log(valor) / Math.log(2);
    }

    public  double fatorial(int n){
        double fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
