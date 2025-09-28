package exercicios_de_fixacao;

import java.util.Scanner;
import Entities.Employee;

public class Exercicio_salario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.println("Name: ");
		empregado.name = sc.nextLine();
		System.out.println("Gross salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " 
				+  empregado.name
				+", $ " 
				+ String.format("%.2f%n", empregado.netSalary()));
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		empregado.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " 
				+  empregado.name
				+", $ " 
				+ String.format("%.2f", empregado.netSalary()));
		
		sc.close();

	}

}
