package com.example.liter;

public record recrecrec(String languages) {
    @Override
    public String toString() {
        return "língua: " +languages;
    }
}
