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
public abstract class Funcionario extends Pessoa{
    
    protected String    re;
    protected String    admissionDate;
    protected double    salary;
    protected String    department;
    protected int       branch;

    public Funcionario() {
        this.re = "";
        this.admissionDate = "";
        this.salary = 0.0;
        this.department = "";
        this.branch = 0;
    }

    public Funcionario(String re, String admissionDate, double salary, String department, int branch) {
        this.re = re;
        this.admissionDate = admissionDate;
        this.salary = salary;
        this.department = department;
        this.branch = branch;
    }

    public Funcionario(String re, String admissionDate, double salary, String department, int branch,
                       String name, String dateOfBirth, String cpf, String rg, String fatherName, String motherName, 
                       String fone, String email) {
        super(name, dateOfBirth, cpf, rg, fatherName, motherName, fone, email);
        this.re = re;
        this.admissionDate = admissionDate;
        this.salary = salary;
        this.department = department;
        this.branch = branch;
    }
    
    
    
    public void addEmployee() {
        
        Scanner data = new Scanner(System.in);

        System.out.println("---------------------------------- DADOS FUNCIONAIS ------------------------------------");
        System.out.print(" RE(num. registro): ");
        setRe(data.nextLine());
        System.out.print("  Data de Admissão: ");
        setAdmissionDate(data.nextLine());
        System.out.print("           Salario: ");
        setSalary(data.nextDouble());
        data.nextLine();
        System.out.print("      Departamento: ");
        setDepartment(data.nextLine());
        System.out.print("             Ramal: ");
        setBranch(data.nextInt());
        data.nextLine();
        
    }
    
    public void displayEmployee() {
        System.out.println("\n\t\t\tDADOS FUNCIONAIS\n");
        System.out.println("      Registro Empr.: " + getRe() + "  -   Data de Admissão: " + getAdmissionDate());
        System.out.println("        Departamento: " + getDepartment() + "  -  Ramal: " + getBranch());
    }
    
    public void displaySalary() {
        System.out.println("      Salario Mensal: R$" + getSalary() + "  -  Salario Anual: R$" + calculaSalarioAnual());
    }
    
    public double calculaSalarioAnual () {
        return getSalary() * 13;
    }
    
    public String getRe() {
        return re;
    }

    public void setRe(String re) {
        this.re = re;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }
 }
