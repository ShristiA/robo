package com.company;

public class Skill {
    private String skillName;
    private String competency;

    public Skill(){

    }

    public Skill(String skillName, String competency) {
        this.skillName = skillName;
        this.competency = competency;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }
}

