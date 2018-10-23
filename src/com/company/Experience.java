package com.company;

public class Experience {
    private String companyName;
    private String title;
    private int date;
    private String description;

    public Experience(){

    }

    public Experience(String companyName, String title, int date, String description) {
        this.companyName = companyName;
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

