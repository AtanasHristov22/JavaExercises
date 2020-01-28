package com.company;

public class Course {
    private String name;
    private int id;
    private double credits;
    private TypeOfCourse typeOfCourse;
    private static int numberOfCourses=0;

    public Course(int numberOfCourses){
        numberOfCourses++;
        this.id=numberOfCourses;
    }
    public Course(String name, int credits, TypeOfCourse typeOfCourse){
        numberOfCourses++;
        this.name=name;
        this.id=numberOfCourses;
        this.credits=credits;
        this.typeOfCourse=typeOfCourse;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public double getCredits(){return credits;}
    public void setCredits(double credits){this.credits=credits;}

    public TypeOfCourse getTypeOfCourse(){return typeOfCourse;}
    public void setTypeOfCourse(TypeOfCourse typeOfCourse){this.typeOfCourse=typeOfCourse;}

    public int getNumberOfCourses(){return numberOfCourses;}
    public void setNumberOfCourses(int numberOfCourses){this.numberOfCourses=numberOfCourses;}


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", number=" + id +
                ", credits=" + credits +
                ", typeOfCourse=" + typeOfCourse +
                '}';
    }
}
