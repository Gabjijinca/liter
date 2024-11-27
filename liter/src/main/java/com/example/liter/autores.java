package com.example.liter;

public record autores(String name, Integer  birth_year, Integer  death_year) {
    @Override
    public String toString() {
        return ""+name;
    }
}
