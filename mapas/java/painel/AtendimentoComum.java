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
public class AtendimentoComum implements TipoAtendimento {
    
    private final Senha senha;
    private final String numSenha;

    public AtendimentoComum() {
        
        this.senha = new SenhaComum();
        
        numSenha = senha.criarSenha();
    }
    
    @Override
    public String getSenha() {
        
        return this.numSenha;
    }
}
