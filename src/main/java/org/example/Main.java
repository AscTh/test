package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        final var map = new HashMap<>();
        map.put("1", null);
        map.put("2", null);
        map.put("3", null);
        System.out.println(map);


/*        String inputFile = "src/main/resources/input.txt";
        List<String> lineList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(inputFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                lineList.add(inputLine);
            }
        }
        Collections.sort(lineList);
        lineList.forEach(System.out::println);*/
    }
}