package com.example.liter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface authorReposit extends JpaRepository <author,Long> {
    author findFirstByAuthorNamesAndTitle(String authorNames, String title);

}
