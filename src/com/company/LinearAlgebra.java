package com.company;

public class LinearAlgebra extends Discipline{

    protected LinearAlgebra(StudentAITU studentAITU) {
        super(studentAITU);
    }

    @Override
    public void studyDisciplines() {
        System.out.println("Linear Algebra Course: ");
        studentAITU.study();
    }
}
