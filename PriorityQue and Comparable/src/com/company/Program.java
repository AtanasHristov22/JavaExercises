package com.company;

import java.util.HashSet;
import java.util.TreeSet;

public class Program{
    private String name;
    private HashSet<Course> listOfCourses;
    private TreeSet<Course> treelistOfCourses;


    public Program(String name){
        this.name = name;
        this.listOfCourses = new HashSet<>();
        this.treelistOfCourses = new TreeSet<>();
    }

    public String getName(){return name;}
    public HashSet<Course> getListOfCourses(){return listOfCourses;}
    public TreeSet<Course> getTreelistOfCourses(){return treelistOfCourses;}

    public void addTreeCourse(Course course){
        if(treelistOfCourses.contains(course)){
            //treelistOfCourses.add(course);
            System.out.println("Sorry this course is already taken!!");
        }else{
            treelistOfCourses.add(course);
        }
    }
    public void displayAllCoursesInTreeSet(){
        System.out.println("Courses in TreeSet: ");
        for (Course course:treelistOfCourses) {
            System.out.println(course);
        }
    }

    public void addCourse(Course course){
        if(listOfCourses.contains(course)) {
            //listOfCourses.add(course);
            System.out.println("Sorry this course is already taken!!");
        }else{
            listOfCourses.add(course);
        }
    }
    public void displayAllCoursesInHashSet(){
        System.out.println("Courses in HashSet: ");
        for (Course course:listOfCourses) {
            System.out.println(course);
        }
    }


    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", listOfCourses=" + listOfCourses +
                '}';
    }
}
