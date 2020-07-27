package com.gmail.carbit3333333.services;

import com.gmail.carbit3333333.model.questionsmodel.Questions;

import java.util.List;

public interface QuestionService {

    List<Questions> getAllFromQuestion();
    Questions findByTopId();
}
