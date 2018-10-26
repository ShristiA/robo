package com.company;

import java.util.ArrayList;

public class Experience {
    private String companyName;
    private String title;
    private int date;
    ArrayList<String>duty;

    public Experience() {
    }

    public Experience(String companyName, String title, int date, ArrayList<String> duty) {
        this.companyName = companyName;
        this.title = title;
        this.date = date;
        this.duty = duty;
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

    public ArrayList<String> getDuty() {
        return duty;
    }

    public void setDuty(ArrayList<String> duty) {
        this.duty = duty;
    }
    public String getDuties(){
        String out= " ";
        for(String dut : duty){
            out +="-" + dut+"\n";
        }
        return out;
    }
}



