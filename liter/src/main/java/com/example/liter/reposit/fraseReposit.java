package com.example.liter.reposit;

import com.example.liter.model.pegatudoBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fraseReposit  extends JpaRepository<pegatudoBank,Long> {
    pegatudoBank findFirstByTitleAndAuthorNames(String title, String authorNames);
}
