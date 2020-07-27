package com.gmail.carbit3333333.services;

import com.gmail.carbit3333333.model.questionsmodel.Questions;
import com.gmail.carbit3333333.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionService {
    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    public List<Questions> getAllFromQuestion() {
        return questionsRepository.findAll();
    }

    @Override
    public Questions findByTopId() {
        return questionsRepository.findTopByOrderByIdDesc();
    }
}
