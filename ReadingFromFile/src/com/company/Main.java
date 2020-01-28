package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Task 1
    static double readPrice() {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Entere the price of the car => ");
        double price = 0;
        try {
            Scanner in = new Scanner(System.in);
            price = in.nextDouble();
            while (price <= 0) {
                pw.println("Enter a positive number!");
                price = in.nextDouble();
            }
        } catch (InputMismatchException e) {
            pw.println("the data entered is not the correct type!" + e);
        }
        return price;
    }

    // Task 2
    static void writeGoods(String outputFilename, Goods goods) {

        try (FileWriter fout = new FileWriter(new File(outputFilename), true);) {

            if (goods != null) {
                fout.append(goods.toString() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
    //Task 2.1
    static double sumOfGoods(String outputFilename)throws IOException{
        double sum = 0;

        try (FileReader fis = new FileReader(new File(outputFilename))){
            BufferedReader bufferedReader = new BufferedReader(fis);

            String line;
            while ((line = bufferedReader.readLine())!= null){
                String price = line.substring(line.lastIndexOf("=") + 1, line.lastIndexOf("}"));
                sum += Double.parseDouble(price);
                System.out.println(price);
            }
        }
        return sum;
    }

    //Task 3
    public static void serializeMovieTheatre(String filePath, MovieTheatre movieTheatre){
        try (FileOutputStream  fos = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);){
            outputStream.writeObject(movieTheatre);
        }
        catch (IOException e){
            System.err.println(e);
        }

    }

    //Task 3.1
    public static void deserializeMovieTheatre(String filePath, MovieTheatre movieTheatre) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream inputStream = new ObjectInputStream(fis);) {

            movieTheatre = (MovieTheatre) inputStream.readObject();

            System.out.println(movieTheatre);

        } catch (ClassNotFoundException ex) {
            System.err.println("Class not found: " + ex);
        } catch (IOException ex) {
            System.err.println("IO error: " + ex);
        }
    }

    public static void main(String[] args) {

        // Task 1
        {
            readPrice();
        }

        //Task 2
        Goods goods1 = new Goods("meat", 15);
        Goods goods2 = new Goods("butter", 6);
        Goods goods3 = new Goods("milk", 9 );

        String filename = "GoodsData.txt";
        writeGoods(filename, goods1);
        writeGoods(filename,goods2);
        writeGoods(filename,goods3);
        try{
            System.out.println("The sum of the prices of the goods is: " + sumOfGoods(filename));
        }
        catch (IOException e){
            System.out.println("The name of the file is not correct! " + e);
        }
        }

        //Task 3
        {
            String filePath = "MovieTheatre.ser";
            int numberOfTicketsSold = 50;
            double pricePerTicket = 10;
            String name = "Arena";
            String address = "Sofia";

            MovieTheatre movieTheatre = new MovieTheatre(name,address, numberOfTicketsSold, pricePerTicket);

            serializeMovieTheatre(filePath,movieTheatre);
            deserializeMovieTheatre(filePath,movieTheatre);

        }
    }

