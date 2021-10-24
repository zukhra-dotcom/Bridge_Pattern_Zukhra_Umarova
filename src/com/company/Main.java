package com.company;

public class Main {

    public static void main(String[] args) {

	Discipline [] disciplines = {
	        new AdvancedJava(new SoftwareEngineer()),
            new LinearAlgebra(new Cybersecurity())
    };

	    for(Discipline discipline: disciplines){
	        discipline.studyDisciplines();
	    }
    }
}
