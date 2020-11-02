/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author galetedanilo
 */
public class Retangulo extends Poligono{
    
    private double base;
    private double altura;

    public Retangulo() {
        this(0.0, 0.0, 4);
    }
    
    public Retangulo(double base, double altura, int quantidadeDeLados) {
        this.base =  base;
        this.altura = altura;
        this.quantidadeDeLados = quantidadeDeLados;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        
        return getBase() * getAltura();
    }
    
    @Override
    public void obterDados() {
        
        try {
            this.setBase(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: ")));
            this.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: ")));
        } catch (HeadlessException | NumberFormatException error) {
            System.out.println("Error: " + error.getMessage());
            System.exit(0);
        } 
    }
    
    public String imprimir() {
        
        return "\nForma Geométrica: RETANGULO\nQuantidade de Lados: " + getQuantidadeDeLados() + 
                "\nAltura: " + getAltura() + "\nBase: " + getBase() + "\nArea: " + calcularArea();
    }
}
