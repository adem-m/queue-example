package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String FILE_PATH = "C:\\Users\\ademr\\Documents\\Code\\blbla\\src\\main\\resources\\doc.xml";
        try {
            MetaDataEntity parse = XmlParser.parse(FILE_PATH);
            int i = 0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}