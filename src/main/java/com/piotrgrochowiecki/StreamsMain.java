package com.piotrgrochowiecki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        List<String> sortedShoppingList = shoppingList.stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(shoppingList);
        System.out.println(sortedShoppingList);
    }
}
