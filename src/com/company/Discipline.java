package com.company;

public abstract class Discipline {

    protected StudentAITU studentAITU;

    protected Discipline(StudentAITU studentAITU) {
        this.studentAITU = studentAITU;
    }

    public abstract void studyDisciplines();
}
