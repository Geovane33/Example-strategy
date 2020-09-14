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
public class Produtos implements Carrinho {

    private String nome;
    private long preco;

    /**
     * @return the produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param produto the produto to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public long getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(long preco) {
        this.preco = preco;
    }

    @Override
    public float calcular(Imposto imposto) {
        return (imposto.getImposto() * preco)/100 + preco;
    }

}
