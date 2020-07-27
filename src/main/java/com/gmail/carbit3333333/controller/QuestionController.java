package com.gmail.carbit3333333.controller;

import com.gmail.carbit3333333.model.questionsmodel.Questions;
import com.gmail.carbit3333333.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<Questions> getAllQuestions() {
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        String login = user.getUsername();
//        System.out.println("---------------" + login);
        return questionService.getAllFromQuestion();
    }

    @RequestMapping(value = "/questions/findByTop", method = RequestMethod.GET)
    public Questions findByTopId() {
        return questionService.findByTopId();
    }

}
