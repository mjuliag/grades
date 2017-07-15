package com.example.julia.com.grades;

/**
 * Created by julia on 7/13/2017.
 */

public class Grades {

    private String name;
    private String mathGrade;
    private String chemistryGrade;
    private String physicsGrade;
    private String historyGrade;

    public Grades(String studentName, String mathGrades, String chemistryGrades, String physicsGrades, String historyGrades) {
        name = studentName;
        mathGrade = mathGrades;
        chemistryGrade = chemistryGrades;
        physicsGrade = physicsGrades;
        historyGrade = historyGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public String getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(String chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public String getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(String physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public String getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        this.historyGrade = historyGrade;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", " + "Student grades: " + "\n" + "Math grade: " + mathGrade + "\n" + "Chemistry grade: " + chemistryGrade + "\n" + "Physics grade: " + physicsGrade + "\n" + "History grade: " + historyGrade;
    }

}
