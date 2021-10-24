package com.company;

public class AdvancedJava extends Discipline{

    protected AdvancedJava(StudentAITU studentAITU) {
        super(studentAITU);
    }

    @Override
    public void studyDisciplines() {
        System.out.println("Advanced Java course: ");
        studentAITU.study();
    }
}
