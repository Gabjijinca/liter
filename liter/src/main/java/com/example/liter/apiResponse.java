package com.example.liter;

import java.util.List;

public record apiResponse(List<newRec> results) {
    @Override
    public String toString() {
        return "" + results;

    }
}
