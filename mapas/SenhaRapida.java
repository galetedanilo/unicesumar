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
public class SenhaRapida extends Senha{
    
    public SenhaRapida() {
        Senha.numero++;
    }
    
    @Override
    public String criarSenha() {
        
        this.setTipo("R");
        
        return getTipo() + "-" + getNumero();
    }
}
