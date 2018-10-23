package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList <Account> accList = new ArrayList<>();

        System.out.println("Enter the first and last name");
        String userName = sc.nextLine();
        System.out.println("enter the email address");
        String userEmail =  sc.nextLine();
        System.out.println("enter your phone number");
        int userNumber = sc.nextInt();
        sc.nextLine();

        accList.add(new Account(userName, userEmail, userNumber));
        userEducation();
    }

    public static void userEducation() {

        ArrayList<Education> eduList = new ArrayList<>();

        System.out.println("enter your school name");
        String userSchool = sc.nextLine();

        System.out.println("enter the year you attended");
        int userYear = sc.nextInt();

        System.out.println("enter your degree");
        String userDegree = sc.nextLine();
        sc.nextLine();
        System.out.println("enter your major");
        String userMajor = sc.nextLine();

        eduList.add(new Education(userSchool, userYear, userDegree, userMajor));

        userExperience();

        for (Education ed : eduList) {
            System.out.println("Education");
            System.out.print(ed.getDegree()+ "\t");
            System.out.println("Major" + ed.getMajor() + "\t");
            System.out.println(userYear);
            System.out.println(userSchool);
        }
    }

    public static void userExperience(){

        ArrayList<Experience> expList = new ArrayList<>();
        System.out.println("enter company name");
        String userCompany =  sc.next();
        System.out.println("enter your title");
        String userTitle = sc.nextLine();
        sc.nextLine();
        System.out.println("enter your end date");
        int userDate = sc.nextInt();
        System.out.println("describe it");
        String userResponse = "y";
        String userdescription= " ";
        expList.add(new Experience(userCompany, userTitle, userDate, userdescription));
        while(userResponse.equalsIgnoreCase("y")){
            userdescription = sc.nextLine();
            sc.nextLine();



            System.out.println("would you like to add another - y for yes and n for no");
            userResponse = sc.next();
            System.out.println("describe it");
            userdescription = sc.nextLine();



        }
        userSkill();

        for(Experience exp: expList){
            System.out.println("Experience");
            System.out.println(userCompany);
            System.out.println(userTitle);
            System.out.println(userDate);
            System.out.println(userdescription);
        }
    }

    public static void userSkill() {


        ArrayList<Skill> skillList = new ArrayList<>();
        System.out.println("enter your skill name");
        String userSkill = sc.next();
        System.out.println("enter your competency");
        String userCompetency = sc.next();

        skillList.add(new Skill(userSkill, userCompetency));

        for (Skill skl : skillList) {
            System.out.println("Skills");
            System.out.println(userSkill);
            System.out.println(userCompetency);

        }
    }





}

