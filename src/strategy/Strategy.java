/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author geovane.saraujo
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Produtos produtos = new Produtos();
        produtos.setNome("Camera Digital");
        produtos.setPreco(100);
        Carrinho carrinho = produtos;

        Imposto imposto = new Imposto();
        CacularOrcamento cacularOrcamento = new CacularOrcamento();
        //imposto de 10%
        imposto.setImposto(10);
        System.out.println(cacularOrcamento.calcular(imposto, carrinho));

        //imposto de 15%
        imposto.setImposto(15);
        System.out.println(cacularOrcamento.calcular(imposto, carrinho));

        //imposto de 25%
        imposto.setImposto(25);
        System.out.println(cacularOrcamento.calcular(imposto, carrinho));

        //aplicando imposto em serviços
        Servicos servicos = new Servicos();
        servicos.setNome("Garantia de 1 ano");
        servicos.setPreco(100);

        Imposto imposto2 = new Imposto();
        imposto2.setImposto(15f);

        carrinho = servicos;
        System.out.println(cacularOrcamento.calcular(imposto2, carrinho));

    }

}
