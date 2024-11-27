package com.example.liter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface fraseReposit  extends JpaRepository<pegatudoBank,Long> {
    pegatudoBank findFirstByTitleAndAuthorNames(String title, String authorNames);
}
