package com.xworkz.appolohospital;

import java.util.Scanner;

import com.xworkz.appolohospital.appolohospital.AppoloHospital;
import com.xworkz.appolohospital.appolohospital.patients.patient.Patient;
import com.xworkz.appolohospital.constatnt.Gender;

public class AppoloHospitalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();

		AppoloHospital apolloHospitals = new AppoloHospital(size);

		for (int i = 0; i < size; i++) {
			Patient patient = new Patient();
			System.out.println("Enter the patient Name");
			patient.setPatientName(scanner.next());
			System.out.println("Enter the patient age");
			patient.setAge(scanner.nextInt());

			System.out.println("Enter the patient Gender");

			patient.setGender(Gender.valueOf(scanner.next()));

			System.out.println("Enter the Patient Address");
			patient.setAddress(scanner.next());

			apolloHospitals.addPatients(patient);

		}

		apolloHospitals.getAllNewPatients();
		
		/*
		 * System.out.println("Enter the patient name"); String patientName =
		 * scanner.next() ; apolloHospitals.getPatientByName(patientName);
		 */
		
		// update operation
		
		/*
		 * System.out.println("Enter the patient name"); String patientName =
		 * scanner.next() ; System.out.println("Enter the patient new Address"); String
		 * newAddress = scanner.next() ;
		 * apolloHospitals.updatePatientAddressByName(patientName, newAddress) ;
		 */
		
		
		System.out.println("Enter the patient name to delete "); 
		String patientName = scanner.next() ;
		
		apolloHospitals.deletePatientByName(patientName);
		//apolloHospitals.getAllNewPatients();
		
		
		
		
		
	}

}