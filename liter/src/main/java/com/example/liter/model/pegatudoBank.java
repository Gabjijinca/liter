package com.example.liter.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "titulos")
public class pegatudoBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String authorNames;
    private Integer download_count;
    private String languages;



    public pegatudoBank(){}


    public pegatudoBank(String title, List<String> authorNames, Integer download_count, String languages) {
        this.title = title;
        this.authorNames = String.join(", ", authorNames);
        this.download_count = download_count;
        this.languages = languages;
    }


    public Integer getDownload_count() {
        return download_count;
    }

    public void setDownload_count(Integer download_count) {
        this.download_count = download_count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(String authorNames) {
        this.authorNames = authorNames;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return " nome do livro: "+title+"\n  " +
                "autor:"+authorNames+"\n  língua " + languages +"\n downloads : " +download_count  +"\n------------------\n";
    }
}
