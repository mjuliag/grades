package com.example.julia.com.grades;

public class Grade {

    private String materia;
    private float nota;

    public Grade(String materia, float nota) {
        this.materia = materia;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Materia: " + materia + "\nNota: " + nota;
    }
}
