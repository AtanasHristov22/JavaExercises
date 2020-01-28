package com.company;

public class Main {

    public static void main(String[] args) {
    	//Task 1 and Task 2
	OnlineShop shop1 = new OnlineShop("Billa");

	Order order1 = new Order("Kartofi");
	Order order2 = new Order("Voda", Priority.HIGH);

	shop1.addOrder(order1);
	shop1.addOrder(order2);
	shop1.displayOrders();
	shop1.removeOrder();
	shop1.addOrder(order1);
	shop1.displayOrders();
	shop1.removeAllOrders();
	shop1.displayOrders();
	// Task 2
	OnlineShopeArrayQue shop3 = new OnlineShopeArrayQue("Levche");
	shop3.addOrder(order1);
	shop3.addOrder(order2);
	shop3.displayOrders();
	shop3.removeOrder();
	//Task 3
	Course course1 = new Course("Math", 3);
	Course course2 = new Course("English", 2);
	Course course3 = new Course("Science fiction",5);
	Course course4 = new Course("Math", 7);
	System.out.println(course1.compareTo(course2));

	Program program1 = new Program("Informatika");
	program1.addCourse(course3);
	program1.addCourse(course2);
	program1.addCourse(course1);
	//program1.addCourse(course4);

	program1.displayAllCoursesInHashSet();

	Program program2 = new Program("Matematika");
	program2.addTreeCourse(course4);
	program2.addTreeCourse(course3);
    program2.addTreeCourse(course2);
    //program2.addTreeCourse(course1);

    program2.displayAllCoursesInTreeSet();

    }
}