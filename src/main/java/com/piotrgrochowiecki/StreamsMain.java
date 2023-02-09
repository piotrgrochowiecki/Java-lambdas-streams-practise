package com.piotrgrochowiecki;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80, 83, 78, 88, 92, 76, 69, 81};

        Stream<Integer> scoresStream = Arrays.stream(scores);

        scoresStream.sorted().forEach(item -> System.out.println(item));
    }
}
