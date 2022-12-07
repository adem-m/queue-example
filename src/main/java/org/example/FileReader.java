package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {
    public static String readFile(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(filePath));

        Stream<String> lines = bufferedReader.lines();
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();
        return data;
    }
}
