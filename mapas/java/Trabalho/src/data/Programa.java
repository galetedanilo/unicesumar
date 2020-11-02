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
public class Programa {
    
    public static void main(String[] args) {
        
        int option = 0;
        
        do {
            
            Object[] possibilities = {"1", "2", "0"};
            
            String text = (String) JOptionPane.showInputDialog(null, "ESCOLHA UMA OPÇÂO:\n\n1 - Triangulo\n"
                                                              + "2 - Retangulo\n0 - SAIR\n\n", "Calcula Area", 
                                                              JOptionPane.QUESTION_MESSAGE, null, possibilities, "1");
            
            if (text == null) {
                System.out.println("Saindo do Sistema");
                System.exit(0);
            }
                
            option = Integer.parseInt(text);

            switch (option) {
                
                case 0:
                    System.exit(0);
                    break;
                    
                case 1:
                    Triangulo triangulo = new Triangulo();
                    triangulo.obterDados();
                    triangulo.imprimirQuantidadeDeLados();
                    JOptionPane.showMessageDialog(null, triangulo.imprimir(), "Dados do Triangulo.", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                case 2:
                    Retangulo retangulo = new Retangulo();
                    retangulo.obterDados();
                    retangulo.imprimirQuantidadeDeLados();
                    JOptionPane.showMessageDialog(null, retangulo.imprimir(), "Dados do Retangulo.", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Valor informado é invalido! Digite novamente!", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    
            }
            
        }while(option != 0);
    }
    
}
