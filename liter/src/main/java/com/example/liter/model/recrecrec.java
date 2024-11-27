package com.example.liter.model;

public record recrecrec(String languages) {
    @Override
    public String toString() {
        return "língua: " +languages;
    }
}
