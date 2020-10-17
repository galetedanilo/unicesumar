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
public abstract class Pessoa {
    
    protected String    name;
    protected String    dateOfBirth;
    protected String    cpf;
    protected String    rg;
    protected String    fatherName;
    protected String    motherName;
    protected Endereco  address;
    protected String    fone;
    protected String    email;

    public Pessoa() {
        this.name = "";
        this.dateOfBirth = "";
        this.cpf = "";
        this.rg = "";
        this.fatherName = "";
        this.motherName = "";
        this.address = new Endereco();
        this.fone = "";
        this.email = "";
    }

    public Pessoa(String name, String dateOfBirth, String cpf, String rg, String fatherName, String motherName, String fone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cpf = cpf;
        this.rg = rg;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = new Endereco();
        this.fone = fone;
        this.email = email;
    }
    
    public abstract void exibeDados();
    
    public void addPerson() {
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("----------------------------------- DADOS PESSOAIS -------------------------------------");
        System.out.print("              Nome: ");
        setName(data.nextLine());
        System.out.print("Data de Nascimento: ");
        setDateOfBirth(data.nextLine());
        System.out.print("               CPF: ");
        setCpf(data.nextLine());
        System.out.print("                RG: ");
        setRg(data.nextLine());
        System.out.print("       Nome do Pai: ");
        setFatherName(data.nextLine());
        System.out.print("       Nome da Mãe: ");
        setMotherName(data.nextLine());
        
        this.address = new Endereco();
        
        this.address.addAddress();
        
        System.out.print("          Telefone: ");
        setFone(data.nextLine());
        System.out.print("            E-mail: ");
        setEmail(data.nextLine());
  
    }
    
    public void displayPerson() {

        System.out.println("\t\t\tDADOS PESSOAIS\n");
        System.out.println("                Nome: " + getName());
        System.out.println("  Data de Nascimento: " + getDateOfBirth());
        System.out.println("                 CPF: " + getCpf() + "  -  RG: " + getRg());
        System.out.println("         Nome da Mãe: " + getMotherName());
        System.out.println("         Nome do Pai: " + getFatherName());
        
        this.address.displayAddress();
        
        System.out.println("            Telefone: " + getFone() + "  -  E-mail: " + getEmail());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
