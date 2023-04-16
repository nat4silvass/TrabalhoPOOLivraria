
package model;

import javax.swing.JOptionPane;


public class Pagamento extends Venda{
    private Double valorApagar;
    private Double troco;
    private String nomect;
    private String nmrCartao;
    private String codCartao;
    private String vencCartao;
    private Double valorCartao;
    private double valorDinheiro;

    public Pagamento() {
    }

    public Pagamento(Double valorApagar, Double troco) {
        this.valorApagar = valorApagar;
        this.troco = troco;
    }

    public Double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(Double valorApagar) {
        this.valorApagar = valorApagar;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }
    public double pgtCartao() {
        JOptionPane.showMessageDialog(null, "Pagamento em Cartão");
        JOptionPane.showMessageDialog(null, "Se deseja pagar em dinheiro\n"
                + "digite 0 no valor a pagar");
        this.nomect = JOptionPane.showInputDialog(null, "Digite seu nome");
        this.nmrCartao = JOptionPane.showInputDialog(null, "Digite o numero "
                + "do cartao");
        this.codCartao = JOptionPane.showInputDialog(null, "Digite o "
                + "codigo do cartão");
        this.vencCartao = JOptionPane.showInputDialog(null, "Digite a"
                + " data de vencimento do cartão");
       double valorCartao = Double.parseDouble(JOptionPane.showInputDialog
            (null, "digite o valor a pagar"));
         return valorCartao;
    }
    public double pgtDinheiro(){
        JOptionPane.showMessageDialog(null, "Pagamento em Dinheiro");
        double valorDinheiro = Double.parseDouble(JOptionPane.showInputDialog
            (null, "digite o quanto voce vai pagar em dinheiro."));
        return valorDinheiro;
    }
    @Override
    public String toString() {
        return "Pagamento{" + "valorApagar=" + valorApagar 
                + ", troco=" + troco + '}';
    }
    
    
}
