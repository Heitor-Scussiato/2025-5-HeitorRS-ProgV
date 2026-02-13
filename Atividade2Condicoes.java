package aula2HRS;

import java.util.Scanner;

public class Atividade2Condicoes {

	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);
		int exe = 1;
		while (exe != 0) {
			System.out.print("Digite o numero do exercício (0=sair): ");
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
			canner key = new Scanner(System.in);
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
			
		}
}
	
	/*
	 * Programação V - Exercícios de revisão (Condição)
  

10) Faça um programa que seja capaz de concluir qual dentre os animais seguintes foi escolhido, através de perguntas e respostas.(CASO e SE)
Exemplo: É mamífero? SIM ? É quadrúpede? SIM ? É carnívoro? NÃO? É herbívoro? SIM Então o animal escolhido foi: cavalo
Utilize as seguintes classificações: 
mamíferos -> quadrúpede---> carnívoro -----> leão
                         -> herbívoro -----> cavalo
          -> bípede ------> onívoro -------> homem
                         -> frutífero -----> macaco
          -> voadores ---------------------> morcego
          -> aquáticos --------------------> baleia
aves ------> não voadoras-> tropical ------> avestruz
                         -> polar ---------> pinguim
          -> nadadoras --------------------> pato
          -> de rapina --------------------> águia
répteis ---> com casco --------------------> tartaruga
          -> carnívoros -------------------> crocodilo
          -> sem patas --------------------> cobra


*/
