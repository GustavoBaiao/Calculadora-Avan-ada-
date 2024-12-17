package ui; // Pacote onde a classe está localizada

import operacoes.OperacoesBasicas; // Importa a classe de operações básicas
import funcoes.FuncoesMatematicas; // Importa a classe de funções matemáticas (não usada neste código ainda)

import javax.swing.*; // Importa componentes da biblioteca Swing
import java.awt.*;    // Importa layout e funcionalidades relacionadas à interface gráfica
import java.awt.event.ActionEvent; // Importa evento de clique
import java.awt.event.ActionListener; // Importa a interface para tratar eventos de ação

public class CalculadoraGUI extends JFrame {

    // Declaração dos componentes de entrada e saída
    private JTextField txtValor1, txtValor2, txtResultado; // Campos de texto para inserir valores e mostrar resultado
    private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnLimpar; // Botões de operações
    private OperacoesBasicas operacoes;

    // Construtor da classe
    public CalculadoraGUI() {
        operacoes = new OperacoesBasicas();

        // Configurações básicas da janela principal
        setTitle("Calculadora Desktop"); // Define o título da janela
        setSize(1920, 1080); // Define o tamanho da janela (largura x altura)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
        setLayout(new GridLayout(6, 2, 5, 5)); // Define um layout de grade (6 linhas, 2 colunas, 5px de espaçamento)

        // Criação dos componentes de interface
        JLabel lblValor1 = new JLabel("Valor 1:"); // Rótulo para o primeiro valor
        txtValor1 = new JTextField(); // Campo de texto para o primeiro valor

        JLabel lblValor2 = new JLabel("Valor 2:"); // Rótulo para o segundo valor
        txtValor2 = new JTextField(); // Campo de texto para o segundo valor

        JLabel lblResultado = new JLabel("Resultado:"); // Rótulo para o resultado
        txtResultado = new JTextField(); // Campo de texto para exibir o resultado
        txtResultado.setEditable(false); // Torna o campo de resultado somente leitura

        // Criação dos botões
        btnSomar = new JButton("Somar");
        btnSubtrair = new JButton("Subtrair");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        btnLimpar = new JButton("Limpar");

        // Adicionando componentes à janela (ordem importa)
        add(lblValor1);
        add(txtValor1);

        add(lblValor2);
        add(txtValor2);

        add(lblResultado);
        add(txtResultado);

        add(btnSomar);
        add(btnSubtrair);
        add(btnMultiplicar);
        add(btnDividir);
        add(btnLimpar);
        // Adiciona ações (eventos) para os botões
        btnSomar.addActionListener(e -> realizarOperacao("somar")); // Evento para somar
        btnSubtrair.addActionListener(e -> realizarOperacao("subtrair")); // Evento para subtrair
        btnMultiplicar.addActionListener(e -> realizarOperacao("multiplicar")); // Evento para multiplicar
        btnDividir.addActionListener(e -> realizarOperacao("dividir")); // Evento para dividir
        btnLimpar.addActionListener(e -> limparCampos()); // Evento para limpar os campos

        setVisible(true); // Torna a janela visível ao usuário
    }

    /**
     * Método para realizar operações com base no botão clicado.
     * @param operacao Tipo de operação ("somar", "subtrair", etc.)
     */
    private void realizarOperacao(String operacao) {
        try {
            // Pega os valores digitados nos campos de texto
            double valor1 = Double.parseDouble(txtValor1.getText());
            double valor2 = Double.parseDouble(txtValor2.getText());
            double resultado = 0;

            // Realiza a operação escolhida
            switch (operacao) {
                case "somar":
                    resultado = operacoes.somar(valor1, valor2);
                    break;
                case "subtrair":
                    resultado = operacoes.subtrair(valor1, valor2);
                    break;
                case "multiplicar":
                    resultado = operacoes.multiplicar(valor1, valor2);
                    break;
                case "dividir":
                    resultado = operacoes.dividir(valor1, valor2);
                    break;
            }

            // Exibe o resultado no campo de texto de resultado
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            // Exibe um aviso se o usuário inserir valores inválidos
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.");
        } catch (ArithmeticException ex) {
            // Exibe um aviso se houver erro aritmético (ex: divisão por zero)
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * Método para limpar todos os campos de entrada e resultado.
     */
    private void limparCampos() {
        txtValor1.setText(""); // Limpa o campo Valor 1
        txtValor2.setText(""); // Limpa o campo Valor 2
        txtResultado.setText(""); // Limpa o campo Resultado
    }

    /**
     * Método principal que inicia o programa.
     * @param args Argumentos da linha de comando (não utilizados aqui)
     */
    public static void main(String[] args) {
        new CalculadoraGUI(); // Cria e exibe a janela principal
    }
}

