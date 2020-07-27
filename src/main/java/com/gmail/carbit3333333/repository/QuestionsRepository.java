package com.gmail.carbit3333333.repository;

import com.gmail.carbit3333333.model.questionsmodel.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
    Questions findTopByOrderByIdDesc();

}
