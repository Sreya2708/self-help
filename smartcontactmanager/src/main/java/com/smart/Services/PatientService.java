package com.smart.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.entities.Quiz;
import com.smart.Repository.QuizRepository;
@Service
public class PatientService implements PatientServiceImpl{
    @Autowired
    private QuizRepository quizRepository;


   
    



    @Override
    public Quiz save(Quiz response) {
        // TODO Auto-generated method stub
     Quiz patient1=new Quiz(response.getSectionID(),response.getSubSectionID(),response.getPatient(),response.getResponse()
        );

        return quizRepository.save(patient1);
    }

}
