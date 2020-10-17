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
public final class Endereco {
    
    private String      street;
    private int         number;
    private String      complement;
    private String      neighborhood;
    private String      city;
    private String      state;
    private String      zipCode;

    public Endereco() {
        
        this.street = "";
        this.number = 0;
        this.complement = "";
        this.neighborhood = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Endereco(String street, int number, String complement, String neighborhood, String city, String state, String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    
    
    public void addAddress() {
        
        Scanner data = new Scanner(System.in);

        System.out.println("----------------------------- CADASTRAR DADOS RESIDENCIAL ------------------------------");
        System.out.print("       Nome da Rua: ");
        setStreet(data.nextLine());
        System.out.print("            Numero: ");
        setNumber(data.nextInt());
        data.nextLine();
        System.out.print("       Complemento: ");
        setComplement(data.nextLine());
        System.out.print("            Bairro: ");
        setNeighborhood(data.nextLine());
        System.out.print("            Cidade: ");
        setCity(data.nextLine());
        System.out.print("            Estado: ");
        setState(data.nextLine());
        System.out.print("               CEP: ");
        setZipCode(data.nextLine());
    }
    
    public void displayAddress() {
        System.out.println("\n\t\t\tDADOS RESIDENCIAL\n");
        System.out.println("                 Rua: " + getStreet() + "   -   Número: " + getNumber());
        System.out.println("         Complemento: " + getComplement() + "   -   Bairro: " + getNeighborhood());
        System.out.println("              Cidade: " + getCity() + "  -  Estado: " + getState() + "  -  CEP: " + getZipCode());
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}
