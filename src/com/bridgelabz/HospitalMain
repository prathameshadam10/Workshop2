package com.bridgelabz;


public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("Ashwini Hospital");
        Hospital hospital2 = new Hospital("Civil Hospital");
        System.out.println(hospital1.getName());
        System.out.println(hospital2.getName());

        Patient patient1 = new Patient("Sachin","50","12345","mumbai","maharastra",Department.PATHOLOGY);
        Patient patient2 = new Patient("Virat", "35","6789","pune","maharastra",Department.CARDIOLOGY);
        Patient patient3 = new Patient("Rohit","36","546377","Latur","Maha",Department.NUROLOGY);

        hospital1.addPatient(patient1);
        hospital1.addPatient(patient2);
        hospital2.addPatient(patient3);

        System.out.println("Patient in Ashwini Hospital");
        for (Patient patient :hospital1.getPatients()){
            System.out.println(patient.getName() + " : " + patient.getDepartment());

        }
        System.out.println("Patient in civil hospital");  {
            for (Patient patient :hospital2.getPatients()){
                System.out.println(patient.getName() + " : " + patient.getDepartment());

            }
        }


    }
}
