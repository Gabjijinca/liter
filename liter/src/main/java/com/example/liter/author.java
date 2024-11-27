package com.example.liter;


import jakarta.persistence.*;

@Entity
@Table(name = "Author")
public class author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String authorNames;
    private int birth_year;
    private int death_year;


    public author(){}

    public author( String title, String authorNames, int birth_year, int death_year) {
        this.title = title;
        this.authorNames = this.authorNames = authorNames;
        this.birth_year = birth_year;
        this.death_year = death_year;
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

    public int getDeath_year() {
        return death_year;
    }

    public void setDeath_year(int death_year) {
        this.death_year = death_year;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }


    @Override
    public String toString() {
        return  " Nome do Autor= " + authorNames + '\n' + " Ano do Nascimento=" + birth_year + '\n' +   " Ano da Morte=" + death_year + '\n'  + "Livro: "+title +'\n' +"----------------------";
    }
}
