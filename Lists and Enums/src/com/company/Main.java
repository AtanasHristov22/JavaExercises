package com.company;

public class Main {

    public static void main(String[] args) {
    ProgramType programTypeMajor=ProgramType.MAJOR;
    programTypeMajor.setCredits(50);
    System.out.println("Number of credits in " + programTypeMajor + ": " + programTypeMajor.getCredits());

    ProgramType programTypeMinor=ProgramType.MINOR;
    programTypeMinor.setCredits(20);
    System.out.println("Number of credits in " + programTypeMinor + ": " + programTypeMinor.getCredits());

    Program computerScience=new Program("Computer Science",ProgramType.MAJOR);
    Program gameDevelopment=new Program("Game development", programTypeMajor.MINOR);

    Course citb305=new Course("CITB305",3,TypeOfCourse.REQUIRED);
    Course citb405=new Course("CITB405",5,TypeOfCourse.ELECTIVE);

    System.out.println(citb305);
    System.out.println(citb405);

    computerScience.addCourse(citb305);
    computerScience.addCourse(citb405);

    System.out.println(computerScience.toString());

    Student gosho=new Student("Gosho", "f4054");
    Student ivan=new Student("Ivan","f5032");

    gosho.addProgram(computerScience);
    gosho.addProgram(gameDevelopment);
    gosho.addCourse(citb305);

    ivan.addProgram(computerScience);
    ivan.addCourse(citb405);

    System.out.println(gosho.toString());
    System.out.println(ivan.toString());

    gosho.greaduatedCourse(citb305);
    gosho.graduateStudent();
    System.out.println(gosho + "got" + gosho.numberOfCreditsGot()+ " credits.");
    System.out.println(gosho + "has to get " + gosho.creditsNeeded()+ " credits.");
    }
}
