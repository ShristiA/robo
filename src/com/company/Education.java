package com.company;

public class Education {
    private String school;
    private int year;
    private String degree;
    private String major;

    public Education(){

    }

    public Education(String school, int year, String degree, String major) {
        this.school = school;
        this.year = year;
        this.degree = degree;
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

