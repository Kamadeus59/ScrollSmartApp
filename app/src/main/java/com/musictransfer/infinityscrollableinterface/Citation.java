package com.musictransfer.infinityscrollableinterface;

public class Citation {
    private String citation;
    private String author;

    public Citation(String c, String a) {
        this.citation = c;
        this.author = a;
    }

    public String getCitation(){
        return this.citation;
    }

    public String getAuthor() {
        return author;
    }
}
