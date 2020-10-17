/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author galetedanilo
 */
public class Cliente extends Pessoa {
    
    private String  usuario;
    private String  senha;

    public Cliente() {
        this.usuario = "";
        this.senha = "";
    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Cliente(String usuario, String senha, String name, String dateOfBirth, String cpf, 
                   String rg, String fatherName, String motherName, String fone, String email) {
        super(name, dateOfBirth, cpf, rg, fatherName, motherName, fone, email);
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    public boolean verificarSenha(String senha) {
        
        return this.senha.equals(senha);
    }
    
    public void addClient() {
        Scanner data = new Scanner(System.in);
        
        addPerson();
        
        System.out.println("----------------------------------- DADOS DE LOGIN -------------------------------------");
        System.out.print("       Nome de Usuario: ");
        setUsuario(data.nextLine());
        System.out.print("                 Senha: ");
        setSenha(data.nextLine());

        System.out.println("\n############################# CADASTRO EFETUADO COM SUCESSO! ###########################\n\n");
    }
    
    @Override
    public void exibeDados() {
        displayPerson();
        
        System.out.println("\n\t\t\tDADOS DE LOGIN\n");
        System.out.println("     Nome de Usuario: " + getUsuario());
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
}
