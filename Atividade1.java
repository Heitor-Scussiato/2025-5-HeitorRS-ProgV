package aula2HRS;

import java.util.Scanner;

public class Atividade1 {
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
			} else {System.out.println("E404: Exe Not Found");}
		}
	}

	public static void exe1() {
		Scanner key = new Scanner(System.in);
		int soma = 0;
		int n = 1;
		while (n != 0) {
			System.out.print("Digite um número Inteiro (0=parar): ");
			n = key.nextInt();
			soma = soma + n;
		}
		System.out.println("\n\nSoma Final: " + soma);
	}

	public static void exe2() {
		Scanner key = new Scanner(System.in);
		int soma = 0;
		int n = 1;
		int i = 0;
		while (n != 0) {
			System.out.print("Digite um número Inteiro (0=parar): ");
			n = key.nextInt();
			soma = soma + n;
			i++;
		}
		System.out.println("\n\nMédia Final: " + soma/(i-1));
	}
	
	public static void exe3() {
		Scanner key = new Scanner(System.in);
		int raio = 0;
		System.out.print("Digite raio: ");
		raio = key.nextInt();
		System.out.println("\n\n Area Circulo: " + (raio * raio * Math.PI));
		System.out.println("Circuferencia: " + (raio * 2 * Math.PI));
	}
	
	public static void exe4() {
		Scanner key = new Scanner(System.in);
		float d1=0, d2 = 0;
		System.out.print("Digite diagonal menor: ");
		d1 = key.nextInt();
		System.out.print("Digite DIAGONAL MAIOR: ");
		d2 = key.nextInt();
		System.out.println("\n\n Area Lozangolo: " + ((d1*d2)/2));
	}
	
	public static void exe5() {
		Scanner key = new Scanner(System.in);
		int r=0, h=0;
		System.out.print("Digite raio: ");
		r = key.nextInt();
		System.out.print("Digite altura: ");
		h = key.nextInt();
		System.out.println("\n\n Volume Tonel: " + (h * (r * r) * Math.PI));
	}

	public static void exe6() {
		Scanner key = new Scanner(System.in);
		float w=0, h=0;
		System.out.print("Digite peso: ");
		w = key.nextInt();
		System.out.print("Digite altura: ");
		h = key.nextInt();
		System.out.println("\n\n Densidade Total: " + (w/h));
	}
	
}