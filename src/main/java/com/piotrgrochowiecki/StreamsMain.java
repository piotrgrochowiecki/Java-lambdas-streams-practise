package com.piotrgrochowiecki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80, 83, 78, 88, 92, 76, 69, 81};

        Stream<Integer> scoresStream = Arrays.stream(scores);

        scoresStream.sorted().forEach(item -> System.out.println(item));

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();

        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach(item -> System.out.println(item));
    }
}
