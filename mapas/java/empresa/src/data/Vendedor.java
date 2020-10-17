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
public class Vendedor extends Funcionario{
    
    private double commission;
    
    public Vendedor() {
        this.commission = 0.0;
    }

    public Vendedor(double commission) {
        this.commission = commission;
    }

    public Vendedor(double commission, String re, String admissionDate, double salary, String department, 
                    int branch) {
        super(re, admissionDate, salary, department, branch);
        this.commission = commission;
    }
    
    public Vendedor(double commission, String re, String admissionDate, double salary, String department, 
                    int branch, String name, String dateOfBirth, String cpf, String rg, String fatherName, 
                    String motherName, String fone, String email) {
        super(re, admissionDate, salary, department, branch, name, dateOfBirth, cpf, rg, fatherName, motherName, fone, email);
        this.commission = commission;
    }

    public void addSeller() {
        Scanner data = new Scanner(System.in);
        
        addPerson();
        addEmployee();
        
        System.out.print(" Valor da Comissao: ");
        setCommission(data.nextDouble());
        data.nextLine();

        System.out.println("\n############################# CADASTRO EFETUADO COM SUCESSO! ###########################\n\n");
    }
    
    @Override
    public void exibeDados() {
        displayPerson();
        displayEmployee();
        System.out.println("               Cargo: VENDEDOR");
        displaySalary();
    }
    
    public double salarioMesComComissao() {
        return getSalary() + commission;
    }
    
    @Override
    public void displaySalary() {
        System.out.println("      Salario Mensal: R$" + getSalary() + "  -  Valor da Comissão: R$" + getCommission());
        System.out.println(" Sal. Men. + Comiss.: R$" + salarioMesComComissao());
        System.out.println("       Salario Anual: R$" + calculaSalarioAnual());
        System.out.println("Sal. Anual + Comiss.: R$" + (calculaSalarioAnual() + (12 * getCommission())));
    }
    
    public double getCommission() {
        return this.commission;
    }
    
    public void setCommission(double commission) {
        this.commission = commission;
    }
    
}
