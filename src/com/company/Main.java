package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        ArrayList <Account> accList = new ArrayList<>();
//
//        System.out.println("Enter the first and last name");
//        String userName = sc.nextLine();
//        System.out.println("enter the email address");
//        String userEmail =  sc.nextLine();
//
//        accList.add(new Account(userName, userEmail));
//
//        ArrayList<Education> eduList = new ArrayList<>();
//
//
        String userSays=" ";
//     do{
//         System.out.println("enter your school name");
//         String userSchool = sc.nextLine();
//        System.out.println("enter the year you attended");
//        int userYear = sc.nextInt();
//        sc.nextLine();
//       System.out.println("enter your degree");
//        String userDegree = sc.nextLine();
//        System.out.println("enter your major");
//        String userMajor = sc.nextLine();
//        eduList.add(new Education(userSchool, userYear, userDegree, userMajor));
//        System.out.println("would you like to add another school degree?");
//
//         userSays = sc.next();
//         sc.nextLine();
//     }while(!userSays.equalsIgnoreCase("n"));


     // Experience
        ArrayList<Experience> expList = new ArrayList<>();
        do {
            System.out.println("enter company name");
            String userCompany = sc.nextLine();
            System.out.println("enter your title");
            String userTitle = sc.nextLine();
            System.out.println("enter your end date");
            int userDate = sc.nextInt();
            sc.nextLine();

            ArrayList<String>duties = new ArrayList<>();

            String userResponse = "";
            do {
                System.out.println("Enter Duty: ");
                String duty = sc.nextLine();
                duties.add(duty);
                System.out.println("would you like to add another duty- y for yes and n for no");
                userResponse = sc.next();
                sc.nextLine();
            } while (userResponse.equalsIgnoreCase("y"));

            expList.add(new Experience(userCompany, userTitle, userDate, duties));
            System.out.println("Do you want to add another experience?");
            userSays = sc.next();
            sc.nextLine();
        }while(!userSays.equalsIgnoreCase("n"));


//        ArrayList<Skill> skillList = new ArrayList<>();
//        do {
//            System.out.println("enter your skill name");
//            String userSkill = sc.next();
//            System.out.println("enter your competency");
//            String userCompetency = sc.next();
//
//            skillList.add(new Skill(userSkill, userCompetency));
//
//            System.out.println("Would you like to another skill");
//            userSays = sc.next();
//        }while(!userSays.equalsIgnoreCase("n"));



//        accountInfo(accList);
//        System.out.println("Education");
//        userEducation(eduList);

        getExperience(expList);

//        System.out.println("Experience");
//        userExperience(expList);
//        System.out.println("Skills");
//        userSkill(skillList);

    }

    private static void getExperience(ArrayList<Experience> expList) {
        System.out.println("Experience");
        for(Experience exp: expList){
            System.out.println(exp.getTitle());
            System.out.println(exp.getCompanyName()+"," +"\b"+ exp.getDate());
            System.out.println(exp.getDuties());

        }
    }


    public static void userExperience(ArrayList<Experience> expList){
        for(Experience exp: expList){
            System.out.println(exp.getTitle());
            System.out.println(exp.getCompanyName()+"," +"\b"+ exp.getDate());
            System.out.println(exp.getDuties());

        }
    }

    public static void accountInfo(ArrayList<Account>accList) {
        for (Account userInfo : accList) {
            System.out.println(userInfo.getName());
            System.out.println(userInfo.getEmail());
        }
    }


    public static void userEducation(ArrayList<Education>eduList) {


        for (Education ed : eduList) {
            System.out.println(ed.getDegree()+ "in" + ed.getMajor());
            System.out.println(ed.getSchool()+ ", " + ed.getYear());

        }
    }



    public static void userSkill(ArrayList<Skill> skillList) {

        for (Skill skl : skillList) {
            System.out.println(skl.getSkillName()+","+ skl.getCompetency());

        }

    }



}

