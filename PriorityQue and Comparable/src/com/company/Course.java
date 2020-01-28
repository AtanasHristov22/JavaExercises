package com.company;

public class Course implements Comparable<Course> {
    private String name;
    private int numberOfCredits;

    public Course(){
    }

    public Course(String name, int numberOfCredits){
        this.name = name;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName(){return name;}
    public int getNumberOfCredits(){return numberOfCredits;}

    @Override
    public int compareTo(Course course){return this.name.compareTo(course.name);}
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfCredits=" + numberOfCredits +
                '}';
    }
}
