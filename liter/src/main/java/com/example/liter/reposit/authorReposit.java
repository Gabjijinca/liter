package com.example.liter.reposit;

import com.example.liter.model.author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface authorReposit extends JpaRepository <author,Long> {
    author findFirstByAuthorNamesAndTitle(String authorNames, String title);

}
