package org.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MetaEntity {
    private String date;
    @JacksonXmlProperty(localName = "editing-duration")
    private String editingDuration;
    @JacksonXmlProperty(localName = "editing-cycles")
    private String editingCycles;
    @JacksonXmlProperty(localName = "document-statistic")
    private String documentStatistic;
    private String generator;

    public String getEditingCycles() {
        return editingCycles;
    }

    public void setEditingCycles(String editingCycles) {
        this.editingCycles = editingCycles;
    }

    public String getDocumentStatistic() {
        return documentStatistic;
    }

    public void setDocumentStatistic(String documentStatistic) {
        this.documentStatistic = documentStatistic;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEditingDuration() {
        return editingDuration;
    }

    public void setEditingDuration(String editingDuration) {
        this.editingDuration = editingDuration;
    }
}
