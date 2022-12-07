package org.example;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlParser {
    public static MetaDataEntity parse(String xmlFilePath) throws IOException {
        String data = FileReader.readFile(xmlFilePath);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(data, MetaDataEntity.class);
    }
}
