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
public class CacularOrcamento{

    public float calcular(Imposto imposto, Carrinho carrinho) {
      return carrinho.calcular(imposto);
    }
    
    
}
