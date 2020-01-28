package com.company;

public class Engineer extends Creator {
    private int hourlyWage;
    private int totalHoursWorked;

    public Engineer(int hourlyWage, int totalHoursWorked) {
        this.hourlyWage = hourlyWage;
        this.totalHoursWorked = totalHoursWorked;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void addVehicle(Vehicle vehicle){goodsList.add(vehicle);}

    @Override
    public double totalEarnings(){return hourlyWage*totalHoursWorked;}

    @Override
    public String toString() {
        return  "Engineer{" +
                "hourlyWage=" + hourlyWage +
                ", totalHoursWorked=" + totalHoursWorked +
                '}';
    }
}
