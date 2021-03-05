package mytest;

import java.util.Arrays;
import java.util.Comparator;

import myuni.*;

public class OrganizationTest {

	public static void main(String[] args) {
		
		OrganizationalUnit[] units = new OrganizationalUnit[3];
		units[0] = new Library(30, 100000);
		units[1] = new Faculty(Faculty.FacultyName.GEIK, 150, 1800);
		units[2] = new Faculty(Faculty.FacultyName.MFK);
		
		Arrays.sort(units, Comparator.comparing(OrganizationalUnit::getNumberOfEmployees));
		
		listArray(units);
		
	}

	private static void listArray(OrganizationalUnit[] array) {
		for (OrganizationalUnit item : array) {
			System.out.println(item);
		}
	}
}
