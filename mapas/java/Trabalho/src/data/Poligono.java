/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.swing.JOptionPane;

/**
 *
 * @author galetedanilo
 */
public abstract class Poligono {
    
    /**
     *
     */
    protected int quantidadeDeLados;

    public int getQuantidadeDeLados() {
        return quantidadeDeLados;
    }

    public void setQuantidadeDeLados(int quantidadeDeLados) {
        this.quantidadeDeLados = quantidadeDeLados;
    }
    
    public void imprimirQuantidadeDeLados() {
        JOptionPane.showMessageDialog(null, "Quantidade de lados: " + getQuantidadeDeLados());
    }
    
    public abstract double calcularArea();
    
    public abstract void obterDados();
}
