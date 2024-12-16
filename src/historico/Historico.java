
package historico;

import java.util.List;

public class Historico {

    private List<String> operacoes;

    public Historico(List<String> operacoes) {
        this.operacoes = operacoes;
    }

    public  void adicionarOperacao(String operacao) {
        operacoes.add(operacao);
    }

    public void imprimirOperacoes() {
        for (String operacao : operacoes) {
            System.out.println(operacao);
        }
    }

    public void  limparHistorico(){
        operacoes.clear();
    }

    public  String ultimaHistorico(){
        if(operacoes.isEmpty()){
            return "Nenhuma operação registrada";
        }
        return operacoes.get(operacoes.size()-1);
    }
}
