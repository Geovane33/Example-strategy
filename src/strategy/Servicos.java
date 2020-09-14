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
public class Servicos implements Carrinho{
    private String nome;
    private long preco;
    @Override
    public float calcular(Imposto imposto) {
     return (imposto.getImposto() * getPreco())/100 + getPreco();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
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
    
}
