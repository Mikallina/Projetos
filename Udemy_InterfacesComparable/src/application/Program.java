package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) { 
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Windows\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(","); //cria um vetor de duas posições para imprimir Nome e Salario, e ele se baseia na , (virgula)
				list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); 
				employeeCsv = br.readLine();
			}
			Collections.sort(list); //ordem alfabetica
			for (Employee emp : list) {
				System.out.println(emp.getName() + " , " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}

/*
 * Para ordenar por salario, mudar na Classe Employee o Override para Salary e para ordernar em ordem crescente acrecentar o - antes de salario.
 * 
 * */
 */