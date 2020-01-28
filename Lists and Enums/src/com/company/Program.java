package com.company;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private ProgramType programType;
    List<Course> courseList;

    public Program(){
        this.courseList=new ArrayList<>();
    }
    public Program(String name, ProgramType programType, List<Course> coursesList){
        this.name=name;
        this.programType=programType;
        this.courseList= coursesList;
    }

    public Program(String name, ProgramType programType){
        this.name=name;
        this.programType=programType;
        this.courseList=new ArrayList<>();
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public ProgramType getProgramType(){return programType;}
    public void setProgramType(ProgramType programType){this.programType=programType;}

    public List<Course> getCourseList(){return courseList;}
    public void setCourseList(List<Course> courseList){this.courseList=courseList;}

    public void addCourse(Course course){
        if(!this.courseList.contains(course)){
            this.courseList.add(course);
        }
    }

    public void removeCourse(Course course){ this.courseList.remove(course); }

    public void displayCourses(){
        for (Course course:courseList) {
            System.out.println(course);
        }
    }

    public void displayCoursesByType(TypeOfCourse typeOfCourse){
        for(Course course: courseList){
            if(course.getTypeOfCourse() == typeOfCourse){
                System.out.println(course);
            }
        }

    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", programType=" + programType +
                ", courseList=" + courseList +
                '}';
    }
}
