package atvdd;

import java.util.Scanner;

public class atvdd1 {

	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int x[] = new int[10];
		int n,i,aux;
		for(i=0;i<=9;i++) {
			System.out.println("digite a nota do "+ (i+1+" aluno "));
			x[i]=in.nextInt();	
		}
		for(n=1;n<=10;n++) {
			for(i=0;i<=3;i++);
			if(x[i]>x[i+1]) {
				aux=x[i];
				x[i]=x[i+1];
				x[i+1]=aux;
			}
		}

		for(i=0;i<=9;i++) {
			System.out.println((i+1)+" aluno nota:"+x[i]);
		}
	}

}
