package com.kodilla.good.patterns.challenges;


import java.util.stream.Collectors;

public class MainGoodPatterns {

    public static void main(String[] args) {

        System.out.println(printingMovies());

    }

    public static String printingMovies() {
        return MovieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
    }
}
