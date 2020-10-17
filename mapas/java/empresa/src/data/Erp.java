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
public class Erp {
    
    private final Pessoa people[];
    
    private final Scanner data;
    private int     cont;
    private int     opcao;

    public Erp() {
        this.people = new Pessoa[30];
        this.data   = new Scanner(System.in);
        this.opcao  = 0;
        this.cont   = 0;
    }
    
    
    private void showMenu() {
        
        do {
            System.out.println("#######################################################################################");
            System.out.println("##                                                                                   ##");
            System.out.println("##                    ASYTEM - ERP - CONTROLE E GESTÃO DE PESSOAS                    ##");
            System.out.println("##                                                                                   ##");
            System.out.println("#######################################################################################");

            System.out.println("\n\t\t\tDIGITE A OPÇÂO DESEJADA:\n");
            System.out.println("1 - Cadastrar Cliente.           2 - Exibir Todos os Clientes.");
            System.out.println("3 - Cadastrar Vendedor.          4 - Exibir Todos os Vendedores.");
            System.out.println("5 - Cadastrar Secretária.        6 - Exibir Todas as Secretárias.");
            System.out.println("7 - Cadastrar Presidente.        8 - Exibir Presidentes.");
            System.out.println("9 - Testar Sistema.");
            System.out.println("0 - Sair do Sistema");
            
            if(this.opcao > 9 || this.opcao < 0)
                System.out.println("\nOpção Invalida. Digite Novamente.");
            
            System.out.print("\nDigite Uma Opção: ");
            this.opcao = this.data.nextInt();
            this.data.nextLine();

        }while (this.opcao > 9 || this.opcao < 0);
        
    }
    
    private void returnMenu() {
        
        System.out.print("TECLE ENTER PARA VOLTAR AO MENU: ");
        this.data.nextLine();
        System.out.print("\n\n");
    }
 
    private void addNewClient() {
        
        Cliente client = new Cliente();
        
        try {
            client.addClient();

            this.people[this.cont] = client;
            
            this.cont++;
            
        } catch(IndexOutOfBoundsException error) {
            
            System.out.println("Não foi possivel cadastar um novo CLIENTE: lista esta cheia!");
            
        } catch (Exception error) {
            
            System.out.println("Não foi possivel cadastrar um novo CLIENTE: " + error);
        }
        
        this.returnMenu();
    }
    
    public void showAllClient() {
        
        boolean q = true;
        
        for (int x = 0; x < this.cont; x++)
        {
            if(this.people[x] instanceof Cliente)
            {
                this.people[x].exibeDados();
                System.out.println("\n#######################################################################################\n");
                q = false;
            }  
        }
        
        if(q)
            System.out.println("Não existe cliente cadastrado no momento!\n\n");
        else
            System.out.println("\n\n");
        
        this.returnMenu();
    }
    
    private void addNewPresident() {
        
        Presidente president = new Presidente();
        
        try {
            president.addPresident();

            this.people[this.cont] = president;
            
            this.cont++;
            
        } catch(IndexOutOfBoundsException error) {
            
            System.out.println("Não foi possivel cadastar um novo PRESIDENTE: lista esta cheia!");
            
        } catch (Exception error) {
            
            System.out.println("Não foi possivel cadastrar um novo PRESIDENTE: " + error);
        }
        
        this.returnMenu();
    }
    
    private void showAllPresident() {
        
        boolean q = true;
        
        for (int x = 0; x < this.cont; x++)
        {
            if(this.people[x] instanceof Presidente)
            {
                this.people[x].exibeDados();
                System.out.println("\n#######################################################################################\n");
                q = false;
            }  
        }
        
        if(q)
            System.out.println("Não existe presidente cadastrado no momento!\n\n");
        else
            System.out.println("\n\n");
        
        this.returnMenu();
    }
    
    private void addNewSecretary() {
        
        Secretaria secretary = new Secretaria();
        
        try {
            secretary.addSecretary();

            this.people[this.cont] = secretary;
            
            this.cont++;
            
        } catch(IndexOutOfBoundsException error) {
            
            System.out.println("Não foi possivel cadastar uma nova SECRETARIA: lista esta cheia!");
            
        } catch (Exception error) {
            
            System.out.println("Não foi possivel cadastrar uma nova SECRETARIA: " + error);
        }
        
        this.returnMenu();
    }
    
    private void showAllSecretary() {
        
        boolean q = true;
        
        for (int x = 0; x < this.cont; x++)
        {
            if(this.people[x] instanceof Secretaria)
            {
                this.people[x].exibeDados();
                System.out.println("\n#######################################################################################\n");
                q = false;
            }  
        }
        
        if(q)
            System.out.println("Não existe secretaria cadastrada no momento!\n\n");
        else
            System.out.println("\n\n");
        
        this.returnMenu();
    }
        
    private void addNewSeller() {
        
        Vendedor seller = new Vendedor();
        
        try {
            seller.addSeller();

            this.people[this.cont] = seller;
            
            this.cont++;
            
        } catch(IndexOutOfBoundsException error) {
            
            System.out.println("Não foi possivel cadastar um novo VENDEDOR: lista esta cheia!");
            
        } catch (Exception error) {
            
            System.out.println("Não foi possivel cadastrar um novo VENDEDOR: " + error);
        }
        
        this.returnMenu();
    }
    
    private void showAllSeller() {
        
        boolean q = true;
        
        for (int x = 0; x < this.cont; x++)
        {
            if(this.people[x] instanceof Vendedor)
            {
                this.people[x].exibeDados();
                System.out.println("\n#######################################################################################\n");
                q = false;
            }  
        }
        
        if(q)
            System.out.println("Não existe vendedor cadastrado no momento!\n\n");
        else
            System.out.println("\n\n");
        
        this.returnMenu();
    }
    
    private void systemTest() {
        
        Pessoa pessoas[] = new Pessoa[10];
        
        Presidente presidente;
        Secretaria secretariaFatima, secretariaAna;
        Vendedor vendedorJoao, vendedorVanessa, vendedorCarlos;
        Cliente clienteMarcos, clienteJoana, clienteElisa, clienteLucas;
        
        Endereco endAsdrubal, endFatima, endAna, endJoao, endVanessa, endCarlos, endElisa, endMarcos, endJoana, endLucas;
        
        System.out.println("\n\n\t\tTESTANDO SISTEMA\n\n");
        
        System.out.println("Cadastrando o Presidente: Asdrubal Leôncio Correa.");
        
        presidente = new Presidente("0015", "04/05/2015", 10000.00, "Administrativo",
                                    1515, "Asdrubal Leôncio Correa", "07/07/1970",
                                    "349.785.789.45", "78.896.789-4 SSP", "Pedro Antonio Correa",
                                    "Maria Jose Leônica Correa", "55 - (19) 97789-4589",
                                    "asdrubalcorrea@gmail.com");
        
        endAsdrubal = new Endereco("João Pessoa Silva", 5897, "Apart. 455", "Villa Mariana", 
                                   "São Paulo", "São Paulo", "045.789-145");
        
        presidente.setAddress(endAsdrubal);
        
        pessoas[0] = presidente;
        
        System.out.println("Cadastro EFETUADO");
        
        System.out.println("Cadastrando Secretárias: Fatima e Ana.");
        
        secretariaFatima = new Secretaria("3201", "12/05/2018", 2500.00, "Contabilidade", 1010, "Fatima Silva Crespin", 
                                          "03/07/1989", "355.872.934-78", "32.789.456-2", "Jose Romildo Crespin", 
                                          "Maria Aparecida Silva", "55 - (11) - 78945-4554", "crespin_fatima@gmail.com");
        
        endFatima = new Endereco("Av. Penti Fino", 1253, "Casa", "Centro", 
                                 "São Paulo", "São Paulo", "078.123-145");
        
        secretariaFatima.setAddress(endFatima);
        
        secretariaAna = new Secretaria("3202", "10/07/2018", 2500.00, "Recursos Humano", 1020, "Ana Paula Barbieri", 
                                       "31/09/2001", "458.789.159-97", "45.789.321-0", "Vicenti Costa Barbieri", 
                                       "Celestina Costa e Silva", "55 - (11) - 99862-7845", "ana_barbieri@uol.com.br");
        
        endAna = new Endereco("Pau Brasil", 345, "sitio", "Mato Dentro", 
                              "São Bernado", "São Paulo", "145.789-456");
        
        secretariaAna.setAddress(endAna);
        
        pessoas[1] = secretariaAna;
        pessoas[2] = secretariaFatima;
        
        System.out.println("Cadastro EFETUADO");
        
        System.out.println("Cadastrando Vendedor: João, Vanessa e Carlos");
        
        vendedorJoao = new Vendedor(1200.00, "2001", "05/02/2020", 3200.00, "Vendas de Semi-novos", 5505, "João Pereira Rufino",
                                    "10/12/1975", "456.321.753-91", "32.489.759-4", "Carlita Pereira Rufino", 
                                    "Miguel Batista Rufino", "55 - (11) - 97896-4879", "rufinojoao@ig.com.br");
        
        endJoao = new Endereco("Perreira Babuino Otoriniel", 781, "sobrado", "Jd. Casa Nova", 
                               "São Bernado", "São Paulo", "145.789-123");
        
        vendedorJoao.setAddress(endJoao);
        
        vendedorVanessa = new Vendedor(1200.00, "2002", "05/02/2020", 3200.00, "Vendas de Semi-novos", 5507, "Vanessa Bonfim Braz",
                                       "10/12/1997", "789.456.123-10", "78.896.752-2", "Ana Batista Braz", 
                                       "Pedro Batista Braz", "55 - (12) - 9956-4222", "vanessabbb324@gmail.com");
        
        endVanessa = new Endereco("Carlos Brum Perin", 325, "casa", "Jd. Villa Funda", 
                                  "São Caetano", "São Paulo", "189.456-789");
        
        vendedorVanessa.setAddress(endVanessa);
        
        vendedorCarlos = new Vendedor(1200.00, "2003", "10/01/2020", 3200.00, "Vendas de Novos", 5508, "Carlos Bunti Racoreti",
                                      "10/12/1989", "159.753.789-81", "015.759.321-7", "Maria Rosa Bunti Racoreti", 
                                      "Vicenti Teodoro Racoreti", "55 - (11) - 89752-4578", "carlos_bunti@yahoo.com");
        
        endCarlos = new Endereco("Pre. Luiz Inacio da Silva", 1347, "casa", "Cidade Nova", 
                                 "Lapa", "São Paulo", "178-526-478");
        
        vendedorCarlos.setAddress(endCarlos);
        
        pessoas[3] = vendedorCarlos;
        pessoas[4] = vendedorJoao;
        pessoas[5] = vendedorVanessa;
        
        System.out.println("Cadastro EFETUADO");
        
        System.out.println("Cadastrando Cliente: Marcos, Joana, Elisa e Lucas");
        
        clienteElisa = new Cliente("elisa123", "89457", "Elisa Novais", "27/03/2001", "349.789.589-21", "45.789.325-8", 
                                   "Ana Paula Cortez", "Carlos Novais", "55 - (32) - 4328-7852", "elisanovais@gmail.com");
        
        endElisa = new Endereco("Francisco da Silva", 555, "casa", "Campo Bonito", "Caratinga", "Minas Gerais", "145.665-002");
        
        clienteElisa.setAddress(endElisa);
        
        clienteMarcos = new Cliente("marcosperreira", "mp12+-*", "Marcos Pereira Silva", "18/07/2007", "562.789.456-78", "45.789.325-8", 
                                    "Vivian Robuste Silva", "Vicente Faria Silva", "55 - (21) - 3875-2172", "marcos32p@gmail.com");
        
        endMarcos = new Endereco("Vicentino Cabral", 111, "", "Terra Nova", "Vitoria da Conquista", "Minas Gerais", "169.689-785");
        
        clienteMarcos.setAddress(endMarcos);
        
        clienteJoana = new Cliente("bispojoana", "fpz85ga", "Joana Gabiate Bispo", "24/09/2010", "254.824.966-21", "32.798.321-5", 
                                   "Tereza Tumo Bispo", "João da Silva Bispo", "55 - (27) - 499765-8945", "bispo32jona@ig.com.br");
        
        endJoana = new Endereco("Senador Farino Benete Tunfo", 1256, "Apr. 132", "Centro", "Campinas", "São Paulo", "133.789-456");
        
        clienteJoana.setAddress(endElisa);
        
        clienteLucas = new Cliente("pepinoazul", "bebenovo", "Lucas Ferro", "03/03/2010", "125.789.655-25", "12.789.456-0", 
                                   "Maria Silva Ferro", "José Carlos Ferro", "55 - (42) - 99483-5621", "ferrolucas@gmail.com");
        
        endLucas = new Endereco("Antonio Cantele", 876, "casa", "Morada do Sol", "Indaiatuba", "São Paulo", "133.342-458");
        
        clienteLucas.setAddress(endLucas);
        
        pessoas[6] = clienteLucas;
        pessoas[7] = clienteMarcos;
        pessoas[8] = clienteElisa;
        pessoas[9] = clienteJoana;
        
        System.out.println("Cadastro EFETUADO");
        
        System.out.println("\n\n\t\t\tEXIBIR TODOS\n\n");
        
        for(int x = 0; x < 10; x++)
        {
            pessoas[x].exibeDados();
            System.out.println("\n#######################################################################################\n");
        }
        
        this.returnMenu();
    }
    
    public static void main(String args[]) {
        
        Erp program = new Erp();
        
        do {
            program.showMenu();

            switch(program.opcao) {

                case 1:
                    System.out.println("\n\n############################## CADASTRAR NOVO CLIENTE #################################\n");

                    program.addNewClient();
                    break;
                    
                case 2:
                    System.out.println("\n\n############################ EXIBIR TODOS OS CLIENTES #################################\n");

                    program.showAllClient();
                    break;

                case 3:
                    System.out.println("\n\n############################## CADASTRAR NOVO VENDEDOR ################################\n");

                    program.addNewSeller();
                    break;
                    
                case 4:
                    System.out.println("\n\n############################ EXIBIR TODOS OS VENDEDORES ###############################\n");

                    program.showAllSeller();
                    break;

                case 5:
                    System.out.println("\n\n############################# CADASTRAR NOVA SECRETÁRIA ###############################\n");

                    program.addNewSecretary();
                    break;
                    
                case 6:
                    System.out.println("\n\n############################ EXIBIR TODAS AS SECRETÁRIA ###############################\n");

                    program.showAllSecretary();
                    break;

                case 7:
                    System.out.println("\n\n############################# CADASTRAR NOVO PRESIDENTE ###############################\n");

                    program.addNewPresident();
                    break;
                    
                case 8:
                    System.out.println("\n\n############################ EXIBIR TODOS OS PRESIDENTES ##############################\n");

                    program.showAllPresident();
                    break;
                    
                case 9:
                    System.out.println("\n\n################################ TESTANDO O SISTEMA ###################################\n");

                    program.systemTest();
                    break;


                case 0:
                    System.out.println("\n\n################################ SAINDO DO SISTEMA  ###################################\n");
                    break;


            }
        } while(program.opcao != 0);
    }
    
}
