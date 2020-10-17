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
public class Presidente extends Funcionario{
    
    public Presidente() {
        
    }

    public Presidente(String re, String admissionDate, double salary, String department, int branch) {
        super(re, admissionDate, salary, department, branch);
    }

    public Presidente(String re, String admissionDate, double salary, String department, int branch, 
                      String name, String dateOfBirth, String cpf, String rg, String fatherName, 
                      String motherName, String fone, String email) {
        super(re, admissionDate, salary, department, branch, name, dateOfBirth, cpf, rg, fatherName, motherName, fone, email);
    }

    public void addPresident() {
        
        addPerson();
        addEmployee();
        
        System.out.println("\n############################# CADASTRO EFETUADO COM SUCESSO! ###########################\n\n");
    }
    
    @Override
    public void exibeDados() {
        displayPerson();
        displayEmployee();
        System.out.println("               Cargo: PRESIDENTE");
        displaySalary();
    }
    
}
