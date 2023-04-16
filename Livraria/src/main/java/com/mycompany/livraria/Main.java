package com.mycompany.livraria;


import javax.swing.JOptionPane;
import model.Cliente;
import model.LivroVenda;
import model.Livros;
import model.Pagamento;
import model.Venda;


public class Main {

    public static void main(String[] args) {
        Double vlor;
        Cliente c1 = new Cliente();
        c1.setNome("Natã Silva de Souza");
        c1.setCpf("23424240990");
        c1.setPais("Brasil");
        c1.setEstado("Paraná");
        c1.setCidade("Toledo");
        c1.setBairro("centro");
        c1.setRua("rua Barão do rio branco");
        c1.setNumero(401);
        System.out.println(""+c1.toString());
        
       
//...
        Livros L001 = new Livros();
        L001.setId(001);
        L001.setTitulo("A Hora da Estrela");
        L001.setAutor("Clarice Lispector");
        L001.setEditora("Companhia das Letras");
        L001.setAnoDeLancamento("1977");
        L001.setPreco(29.98);
        L001.setQtdEstq(9);
        L001.setGenero("Romance");
        L001.setPaginas(96);
        System.out.println(""+L001.toString()+"\n"+"Preço:"+L001.getPreco());
        
        Livros L002 = new Livros();
        L002.setId(002);
        L002.setTitulo(" Harry Potter e a Pedra Filosofal");
        L002.setAutor("J.K. Rowling");
        L002.setEditora(" Editora Rocco");
        L002.setAnoDeLancamento("1997");
        L002.setPreco(49.90);
        L002.setQtdEstq(10);
        L002.setGenero("Fantasia");
        L002.setPaginas(223);
        System.out.println(""+L002.toString()+"\n"+"Preço:"+L002.getPreco());
        
        Livros L003 = new Livros();
        L003.setId(003);
        L003.setTitulo("O Cavaleiro dos Sete Reinos");
        L003.setAutor("George R.R. Martin");
        L003.setEditora("Leyla");
        L003.setAnoDeLancamento("2015");
        L003.setPreco(59.90);
        L003.setQtdEstq(10);
        L003.setGenero("Fantasia");
        L003.setPaginas(454);
        System.out.println(""+L003.toString()+"\n"+"Preço:"+L003.getPreco());
        
        for (Livros livro : new Livros[]{L001, L002, L003}) {
    if (livro.getQtdEstq() == 0) {
        JOptionPane.showMessageDialog(null, " não temos o livro " + livro.getTitulo() + " "
                + " em estoque escolha outro por favor.");
        return;
    }
    
    }

        
        LivroVenda V1 = new LivroVenda();
        V1.setLivro(L001.getId());
        V1.SetPreco(L001.getPreco());
        V1.setNome(L001.getTitulo());
        
        
        LivroVenda V2 = new LivroVenda();
        V2.setLivro(L002.getId());
        V2.SetPreco(L002.getPreco());
        V2.setNome(L002.getTitulo());
        
        
        LivroVenda V3 = new LivroVenda();
        V3.setLivro(L003.getId());
        V3.SetPreco(L003.getPreco());
        V3.setNome(L003.getTitulo());
        
        
        System.out.println(V1.toString()+V2.toString()
                +V3.toString());
        
        Venda item1 = new Venda();
        item1.setQtd_item(1);
        item1.setVlr_unitario(L001.getPreco());
        item1.setDesconto(10.00);
        item1.calVlrUnitario();
        item1.getVlr_finalItem();
        
         Venda item2 = new Venda();
        item2.setQtd_item(1);
        item2.setVlr_unitario(L002.getPreco());
        item2.setDesconto(10.00);
        item2.calVlrUnitario();
        item2.getVlr_finalItem();
        
         Venda item3 = new Venda();
        item3.setQtd_item(1);
        item3.setVlr_unitario(L003.getPreco());
        item3.setDesconto(10.00);
        item3.calVlrUnitario();
        item3.getVlr_finalItem();
        
        Venda Valorfinal = new Venda();
        Valorfinal.setVlr_Compra(item1.getVlr_finalItem()
                +item2.getVlr_finalItem()+item1.getVlr_finalItem());
        System.out.println(" VALOR A PAGAR: "+Valorfinal.getVlr_Compra());
        
        System.out.println(item1.toString()+item2.toString()
                +item3.toString());
        
       vlor = Valorfinal.getVlr_Compra();
       Pagamento Cartao = new Pagamento();
       double valorCartao = Cartao.pgtCartao();
       if(valorCartao == vlor) {
        JOptionPane.showMessageDialog(null, "O pagamento foi efetuado com sucesso");
        } else {
        JOptionPane.showMessageDialog(null, "ERRO!!!\nPagamento não efetuado ");
    }
      
        Pagamento Dinheiro = new Pagamento();
        double valorDinheiro = Dinheiro.pgtDinheiro();
        if (valorDinheiro == vlor) {
        JOptionPane.showMessageDialog(null, "O pagamento foi efetuado com sucesso");
        } else if (valorDinheiro < vlor) {
         JOptionPane.showMessageDialog(null, "ERRO!!!valor \nPagamento não efetuado" );
        } else {
          double troco =  valorDinheiro - vlor;
        JOptionPane.showMessageDialog(null, "o troco é:"+troco
            );
        }

        L001.setQtdEstq(L001.getQtdEstq() - item1.getQtd_item());
        L002.setQtdEstq(L002.getQtdEstq() - item2.getQtd_item());
        L003.setQtdEstq(L003.getQtdEstq() - item3.getQtd_item());

        System.out.println("\nquantidades atualizdas em estoque:\n"+L001+L002+L003);
   
    }
}
