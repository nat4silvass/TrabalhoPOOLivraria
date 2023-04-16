package model;

import javax.swing.JOptionPane;

public class Venda extends LivroVenda{
   private Double vlr_Compra;
   private Double vlr_unitario;
   private Double vlr_finalItem;
   private Double desconto;
   private int qtd_item;

    public Venda() {
    }

    public Venda(Double vlr_Compra, Double vlr_unitario, Double vlr_finalItem, Double desconto, int qtd_item) {
        this.vlr_Compra = vlr_Compra;
        this.vlr_unitario = vlr_unitario;
        this.vlr_finalItem = vlr_finalItem;
        this.desconto = desconto;
        this.qtd_item = qtd_item;
    }
   
   
   public void calVlrUnitario() {
    if (desconto < vlr_unitario) {
        vlr_finalItem = ((vlr_unitario - desconto) * qtd_item);
        System.out.println("O preço do livro com desconto é: " + vlr_finalItem);
    } else {
        JOptionPane.showMessageDialog(null, "Operação negada \n Desconto inválido");
    }
}


    public Double getVlr_Compra() {
        return vlr_Compra;
    }

    public void setVlr_Compra(Double vlr_Compra) {
        this.vlr_Compra = vlr_Compra;
    }

    public Double getVlr_unitario() {
        return vlr_unitario;
    }

    public void setVlr_unitario(Double vlr_unitario) {
        this.vlr_unitario = vlr_unitario;
    }

    public Double getVlr_finalItem() {
        return vlr_finalItem;
    }

    public void setVlr_finalItem(Double vlr_finalItem) {
        this.vlr_finalItem = vlr_finalItem;
    }

   @Override
    public Double getDesconto() {
        return desconto;
    }

   @Override
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public int getQtd_item() {
        return qtd_item;
    }

    public void setQtd_item(int qtd_item) {
        this.qtd_item = qtd_item;
        
    }
    
    

    @Override
    public String toString() {
        return """
               \n
               Venda
               vlr_Compra:""" + vlr_Compra +
                "\n vlr_unitario:" + vlr_unitario + "\n vlr_finalItem:"
                + vlr_finalItem + "\n desconto:" + desconto + "\n qtd_item:" 
                + qtd_item ;

  
    }
}
