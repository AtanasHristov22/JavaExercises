package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String facultyNumber;
    private String name;
    private boolean graduated;
    private List<Program> programs;
    private List<Course> courses;
    private List<Course> graduatedCourses;

    public Student(String facultyNumber){this.facultyNumber=facultyNumber; }

    public Student(String name, String facultyNumber){
        this.name=name;
        this.facultyNumber=facultyNumber;
        graduated=false;
        this.programs=new ArrayList<>();
        this.courses=new ArrayList<>();
        this.graduatedCourses=new ArrayList<>();
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getFacultyNumber(){return facultyNumber;}

    public boolean getGraduated(){return graduated;}
    public void setGraduated(boolean graduated){this.graduated=graduated;}

    public boolean isProgramTypeEnrolled(ProgramType programType){
        for(Program program: this.programs){
            if(program.getProgramType() == programType){
                return true;
            }
        }
        return false;
    }

    public void addProgram(Program program){
        if(!this.programs.contains(program)){
            this.programs.add(program);
        }
    }
    public void removeProgram(Program program){this.programs.remove(program);}

    public void addCourse(Course course){
        boolean isCourseAdded=false;
        for(Program program: programs){
            if(program.getCourseList().contains(course)){
                this.courses.add(course);
                isCourseAdded=true;
                break;
            }
        }
        System.out.println("This course has been already added!"+ isCourseAdded);
    }
    public void removeCourse(Course course){this.courses.remove(course);}

    public void greaduatedCourse(Course course){
        boolean isCourseGreaduated=false;
        if(!this.courses.contains(course)){
            this.graduatedCourses.add(course);
            isCourseGreaduated=true;
        }
        System.out.println("The course is graduated: " + isCourseGreaduated);
    }
    public void removeGraduatedCourse(Course course){this.graduatedCourses.remove(course);}

    public double numberOfCreditsGot(){
        double numberOfCredits=0;
        for(Course course: this.graduatedCourses){
            numberOfCredits+=course.getCredits();
        }
        return numberOfCredits;
    }

    public double creditsNeeded(){
       return  ProgramType.MAJOR.getCredits() - numberOfCreditsGot();
    }

    public void graduateStudent(){
        if(creditsNeeded()==0){
            this.graduated=true;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultyNumber='" + facultyNumber + '\'' +
                ", name='" + name + '\'' +
                ", graduated=" + graduated +
                ", programs=" + programs +
                ", courses=" + courses +
                ", graduatedCourses=" + graduatedCourses +
                '}';
    }
}
