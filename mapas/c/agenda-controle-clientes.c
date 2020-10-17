/* agenda-controle-clientes.c
 *
 * Copyright 2020 Danilo Galete <galetedanilo@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

#ifdef __unix__

    #include <unistd.h>

#elif defined(_WIN32) || defined(WIN32) 

   #define OS_Windows

#endif

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct cliente{
  int   codigo;
  char  nome[100];
  char  telefone[40];
  char  email[80];
}Cliente;

static void
painel_superior ()
{
  #ifdef OS_Windows
    system("cls");
  #else
    system("clear");
  #endif  
  
  printf ("#######################################################################\n");
  printf ("######                                                           ######\n");
  printf ("####        AGENDA DE CONTROLE DE CLIENTES VERSÂO - 1.0 BETA       ####\n");
  printf ("######                                                           ######\n");
  printf ("#######################################################################\n");
}
  
static void
menu_de_opcoes (int *menu, int erro)
{
 
  do
  {    
    painel_superior ();

    printf ("\n\n\t\tMENU DE OPÇÔES(Escolha uma Opção Valida):\n\n\n");
    printf ("1 - Inserir um Novo Cadastro.\n\n");
    printf ("2 - Mostrar Todos os Cadastros.\n\n");
    printf ("0 - Encerrar.\n\n\n");
    
    if (erro)
      printf ("Atenção! A Opção Informada Não é Valida.\n\n");
      
    printf ("Informe sua opção: ");
    scanf ("%d", menu);
    setbuf (stdin, NULL);
    
    erro = 1;
      
  }while (*menu > 2 || *menu < 0);
  
}

static void
voltar_para_menu ()
{
  int n;
  
  do
  {
    printf ("TECLE \'1\' PARA VOLTAR AO MENU: ");
    scanf ("%d", &n);
    setbuf (stdin, NULL);
  }while (n != 1);
}

static void
exibir_clientes (Cliente clientes[], int total)
{
  painel_superior ();
  
  if (total == 0)
  {
    printf ("\n\n\t\tAGENDA VAZIA!\n\n\n");
    
    voltar_para_menu ();
    
    return;
  }
  
  printf ("\n\n\t\tCLIENTES CADASTRODOS NA AGENDA\n");
  
  for (int n = 0; n < total; n++)
  {
   
    printf ("\n\n########## CLIENTE NUMERO: %d ############\n\n\n", n + 1);
    
    printf ("  CODIGO DO CLIENTE:\t%d\n\n", clientes[n].codigo);
    printf ("    NOME DO CLIENTE: \t%s\n",clientes[n].nome);
    printf ("TELEFONE DO CLIENTE: \t%s\n",clientes[n].telefone);
    printf ("  E-MAIL DO CLIENTE: \t%s\n",clientes[n].email);
  }
  
  printf ("\n\n");
  
  voltar_para_menu ();
}
  
static void
cadastrar_cliente (Cliente clientes[], int *cont)
{
  painel_superior ();
  
  if (*cont > 4)
  {
    printf ("\n\n\t\tAGENDA LOTADA!\n\n\n");
    
    voltar_para_menu ();
    
    return;
  }

  printf ("\n\n\t\tCADASTRAR NOVO CLIENTE\n\n\n");

  printf ("Informe o Nome do Cliente:\t");
  fgets (clientes[*cont].nome, 100, stdin);
  setbuf (stdin, NULL);

  printf ("\nInforme o Telefone do Cliente:\t");
  fgets (clientes[*cont].telefone, 40, stdin);
  setbuf (stdin, NULL);

  printf ("\nInforme o E-mail do Cliente:\t");
  fgets (clientes[*cont].email, 80, stdin);
  setbuf (stdin, NULL);
  
  clientes[*cont].codigo = *cont + 1;
  
  painel_superior ();
  
    
  printf ("\n\n\t\tCADASTRO EFETUADO COM SUCESSO\n\n\n");
  
  printf ("  CODIGO DO CLIENTE: \t%d\n\n", clientes[*cont].codigo);
  printf ("    NOME DO CLIENTE: \t%s\n",clientes[*cont].nome);
  printf ("TELEFONE DO CLIENTE: \t%s\n",clientes[*cont].telefone);
  printf ("  E-MAIL DO CLIENTE: \t%s\n",clientes[*cont].email);
  
  printf ("\n\n");
  
  *cont = *cont + 1;
  
  voltar_para_menu ();
}
  
int
main (int argc, char *argv[])
{
  setlocale (LC_ALL, "portuguese");
  
  int menu, cont = 0;
  
  Cliente clientes[5];
  
  do
  {
    
    menu_de_opcoes (&menu, 0);
    
    switch (menu)
    {
      case 1:
        cadastrar_cliente (clientes, &cont);
        break;
      
      case 2:
        exibir_clientes (clientes, cont);
        break;
        
      default:
        break;
    }
   
    
  }while (menu != 0);


  return 0;
}
