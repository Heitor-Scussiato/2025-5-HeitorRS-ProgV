package aula2HRS;

import java.util.Scanner;

public class Atividade2Condicoes {

	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);
		int exe = 1;
		while (exe != 0) {
			System.out.print("\n Digite o numero do exercício (0=sair): ");
			exe = key.nextInt();
			if (exe == 1) {
				exe1();
			} else if (exe == 2) {
				exe2();
			} else if (exe == 3) {
				exe3();
			} else if (exe == 4) {
				exe4();
			} else if (exe == 5) {
				exe5();
			} else if (exe == 6) {
				exe6();
			} else if (exe == 7) {
				exe7();
			} else if (exe == 8) {
				exe8();
			} else if (exe == 9) {
				exe9();
			} else if (exe ==10) {
				exeX();
			} else {System.out.println("E404: Exe Not Found");}
		}
	}

		public static void exe1() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n = key.nextInt();
			if (n<0) {n*=-1;}
			System.out.print("Número formatado para natural: " + n);
			
		}
		public static void exe2() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n = key.nextInt();
			System.out.print("Número ");
			if (n>0) {System.out.print("Positivo");} else if (n<0){System.out.print("Negativo");}
			else {System.out.print("= 0");}
		}
		public static void exe3() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n1 = key.nextInt();
			System.out.print("Digite outro número Inteiro: ");
			int n2 = key.nextInt();
			if (n1 > n2) {System.out.print("1º > 2º");}
			if (n1 < n2) {System.out.print("1º < 2º");}
			if (n1 ==n2) {System.out.print("1º = 2º");}
		}
		public static void exe4() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n1 = key.nextInt();
			System.out.print("Digite outro número Inteiro: ");
			int n2 = key.nextInt();
			System.out.print("Diferença: ");
			if (n1>n2) {System.out.print(n1-n2);}
			else {System.out.print(n2-n1);}
		}
		public static void exe5() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n = key.nextInt();
			if (n>5 && n<20) {System.out.print("Está no intervalo");}
			else {System.out.print("Fora do intervalo");}
		}
		public static void exe6() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um ano: ");
			int n = key.nextInt();
			if (n%4 == 0) {System.out.print("Ano bixesto");}
			else {System.out.print("Ano comum");}
		}
		public static void exe7() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n1 = key.nextInt();
			System.out.print("Digite outro número Inteiro: ");
			int n2 = key.nextInt();
			System.out.print("Digite mais um número Inteiro: ");
			int n3 = key.nextInt();
			System.out.print("Maior: ");
			if (n1 > n2 && n1 > n3) {System.out.print(n1);}
			else if (n2 > n1 && n2 > n3) {System.out.print(n2);}
			else if (n3 > n1 && n3 > n2) {System.out.print(n3);}
			else {System.out.print("Erro: Houve um empate");}
			System.out.print("Menor: ");
			if (n1 < n2 && n1 < n3) {System.out.print(n1);}
			else if (n2 < n1 && n2 < n3) {System.out.print(n2);}
			else if (n3 < n1 && n3 < n2) {System.out.print(n3);}
			else {System.out.print("Erro: Houve um empate");}
		}
		public static void exe8() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n1 = key.nextInt();
			System.out.print("Digite outro número Inteiro: ");
			int n2 = key.nextInt();
			System.out.print("Digite mais um número Inteiro: ");
			int n3 = key.nextInt();
			System.out.print("Valor do meio: ");
			if (n1 > n2) {
				if (n1 > n3) {
					if (n2 > n3) {
						System.out.print(n2);
					} else {
						System.out.print(n3);
					}
				} else {
					System.out.print(n1);
				}
			} else {
				if (n1 > n3) {
					System.out.print(n1);
				} else {
					if (n2 > n3) {
						System.out.print(n3);
					} else {
						System.out.print(n2);
					}
				}
			}
		}
		public static void exe9() {
			Scanner key = new Scanner(System.in);
			System.out.print("Digite um número Inteiro: ");
			int n = key.nextInt();
			if (n==1) {System.out.print("Domingo!");}
			else if (n==2) {System.out.print("Segunda");}
			else if (n==3) {System.out.print("Terça");}
			else if (n==4) {System.out.print("Quarta");}
			else if (n==5) {System.out.print("Quinta");}
			else if (n==6) {System.out.print("Sexta");}
			else if (n==7) {System.out.print("Sábado!");}
			else {System.out.print("Erro: Valor Inválido");}
		}
		public static void exeX() {
			Scanner key = new Scanner(System.in);
			System.out.print("Pense num dos animais | ele é mamifero? (sim/nao)");
			String resposta = key.next();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.print("Ele é quadrupede?");
				resposta = key.next();
				if (resposta.equalsIgnoreCase("s")) {					
					System.out.print("Ele é carnivoro?");
					resposta = key.next();
					if (resposta.equalsIgnoreCase("s")) {					
						System.out.print("Ele é o LEÃO");
					} else {
						System.out.print("Ele é o CAVALO");
					}
				} else {
					System.out.print("Ele é bípede?");
					resposta = key.next();
					if (resposta.equalsIgnoreCase("s")) {					
						System.out.print("Ele é onívoro?");
						resposta = key.next();
						if (resposta.equalsIgnoreCase("s")) {					
							System.out.print("Ele é o HOMEM");
						} else {
							System.out.print("Ele é o MACACO");
						}
					} else {						
						System.out.print("Ele é voador?");
						resposta = key.next();
						if (resposta.equalsIgnoreCase("s")) {					
							System.out.print("Ele é o MORCEGO");
						} else {
							System.out.print("Ele é a BALEIA");
						}
					}
				}
			} else {
				System.out.print("Ele é uma ave?");
				resposta = key.next();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("Ele voa?");
					resposta = key.next();
					if (resposta.equalsIgnoreCase("n")) {					
						System.out.print("Ele é tropical");
						resposta = key.next();
						if (resposta.equalsIgnoreCase("s")) {					
							System.out.print("Ele é o AVESTRUZ");
						} else {
							System.out.print("Ele é o PINGUIM");
						}
					} else {
						System.out.print("Ele é nadador?");
						resposta = key.next();
						if (resposta.equalsIgnoreCase("s")) {					
							System.out.print("Ele é o PATO");
						} else {						
							System.out.print("Ele é de rapina?");
							resposta = key.next();
							if (resposta.equalsIgnoreCase("s")) {					
								System.out.print("Ele é o URUBU");
							} else {
								System.out.print("Ele é a CALOPSITA");
							}
						}
					}
				} else {
					
				System.out.print("Ele tem casco?");
				resposta = key.next();
				if (resposta.equalsIgnoreCase("s")) {					
					System.out.print("Ele é a TARTARUGA");
				} else {	
					System.out.print("Ele tem patas?");
					resposta = key.next();
					if (resposta.equalsIgnoreCase("s")) {					
						System.out.print("Ele é o JACARÉ");
					} else {System.out.print("Ele é a COBRA");}
				}
			}
		}
	}
}
