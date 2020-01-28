package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        Point point1 = new Point(5.4, 3.6);
        point1.Sum();

        //Example 1  ---> all examples https://www.youtube.com/watch?v=t1-YZ6bF-g0
        IntStream
                .range(1,10)
                .forEach(x -> System.out.print(x));
        System.out.println();
        //Ex.2
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.print(x));
        System.out.println();

        //Ex.3
        System.out.println(
        IntStream
                .range(1,5)
                .sum());

        //Ex.4
        Stream.of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //Ex.5
        String[] names = {"Al", "Ankit", "Kushkal", "Brent","Sarika","amanda","Hans","Shivika","Sandi"};
        Arrays.stream(names) // <=>  Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        //Ex.6
        Arrays.stream(new int[]{2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);
        //Ex.7
        List<String> people = Arrays.asList("Al", "Ankit", "Kushkal", "Brent","Sarika","amanda","Hans","Shivika","Sandi");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        //Ex.8
        Stream<String> band = Files.lines(Paths.get("band.txt"));
        band
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        band.close();

        //Ex.9
        List<String> bands2 = Files.lines(Paths.get("band.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));

        //Ex.10
        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        //Ex.11
        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0]+ " " + x[1] + " " + x[2]));
        rows2.close();

        //Ex.12
        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
                rows3.close();
                for (String key : map.keySet()){
                    System.out.println(key + " " + map.get(key));
                }
        //Ex.13
        double total= Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0,(Double a, Double b) -> a + b);
        System.out.println("Total = " + total);

        //Ex.14
        IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
                .summaryStatistics();
        System.out.println(summary);
    }
}
