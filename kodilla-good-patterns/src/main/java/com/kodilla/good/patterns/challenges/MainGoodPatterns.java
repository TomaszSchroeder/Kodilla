package com.kodilla.good.patterns;


import java.util.stream.Collectors;

public class MainGoodPatterns {

    public static void main(String[] args) {

        //MovieStore movieStore = new MovieStore();
        System.out.println(printingMovies());

    }

    public static String printingMovies() {
        return MovieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
    }
}
