package com.example.liter.model;

import java.util.List;

public record newRec(String title, List<autores> authors, List<String> languages, int download_count ) {

    @Override
    public String toString() {
        return " nome do livro: "+title+"\n  " +
                "autor:"+authors+"\n  língua " + languages +"\n  " +download_count +"\n------------------\n";

    }
}
