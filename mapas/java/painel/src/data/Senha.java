/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author galetedanilo
 */
public abstract class Senha {
    
    protected static int numero = 0;
    protected String tipo;
    
    public int getNumero() {
        return Senha.numero;
    }
        
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     *
     * @return
     */
    public abstract String criarSenha();
}
