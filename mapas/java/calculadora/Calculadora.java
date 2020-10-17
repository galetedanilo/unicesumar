import java.util.Scanner;

public class Calculadora {
	
	private Scanner data = new Scanner(System.in);
	private double valorA, valorB;
	
	private double getNumero() {
		
		return this.data.nextDouble();
	}
	
	private void solicitarNumeros() {
		
		System.out.println("Informe o primeiro valor: ");
		this.valorA = getNumero();
		
		System.out.println("Informe o segundo valor: ");
		this.valorB = getNumero();
	}
	
	public void realizarSoma() {
	
		solicitarNumeros();
		System.out.println("O valor da soma de " + this.valorA + " mais " + this.valorB + ": " + (valorA + valorB));
	
	}
	
	public void realizarSubtracao() {
	
		solicitarNumeros();
		System.out.println("O valor da subtração de " + this.valorA + " mais " + this.valorB + ": " + (valorA - valorB));
	
	}
	
	public void realizarMultiplicacao() {
	
		solicitarNumeros();
		System.out.println("O valor da multiplicação de " + this.valorA + " mais " + this.valorB + ": " + (valorA * valorB));
	
	}
	
	public void realizarDivisao() {
	
		solicitarNumeros();
		System.out.println("O valor da divisao de " + this.valorA + " mais " + this.valorB + ": " + (valorA / valorB));
	
	}
	
	public void realizarQuadrado() {
	
		double numero;
		
		System.out.println("Informe um valor para calcular o quadrado: ");
		
		numero = this.data.nextDouble();
		
		System.out.println("O valor do quadrado do numero " + numero + ": " + (numero * numero));
	
	}
	
	public Calculadora() {
	
		int	operacao = 0;

		
		do {
		
			System.out.println("--------------- Calculadora ------------------");
			
			System.out.println("\nDigete a Operação desejada:");
			
			System.out.println("1 - Soma.");
			System.out.println("2 - Subtração.");
			System.out.println("3 - Multiplicação.");
			System.out.println("4 - Divisão.");
			System.out.println("5 - Quadrado.");
			System.out.println("0 - Sair");
			
			System.out.print("\nInforme a operação: ");
			operacao = this.data.nextInt();
			
			System.out.println("\n");
			
			switch(operacao) {
				
				case 1:
					realizarSoma();
					break;
					
				case 2:
					realizarSubtracao();
					break;
					
				case 3:
					realizarMultiplicacao();
					break;
					
				case 4:
					realizarDivisao();
					break;
					
				case 5:
					realizarQuadrado();
					break;
					
				case 0:
					System.out.println("Saindo...");
					break;
					
				default:
					System.out.println("Ops. Opção Invalida. Informe novamente.");
			}
			
			System.out.println("\n\n");
			
		}while(operacao != 0);	
	}
	
	public static void main (String[] args)
	{
	  new Calculadora();
	}
}
