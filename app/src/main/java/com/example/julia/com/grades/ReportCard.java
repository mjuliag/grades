package com.example.julia.com.grades;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julia on 7/13/2017.
 */

public class ReportCard {

    List<Grade> notas;

    public ReportCard() {
        notas = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        notas.add(grade);
    }

    @Override
    public String toString() {
        String boletin = "";
        for (Grade nota : notas) {
            boletin = boletin + nota.toString();
            boletin = boletin + "\n----------------\n";
        }
        return boletin;
    }

}
