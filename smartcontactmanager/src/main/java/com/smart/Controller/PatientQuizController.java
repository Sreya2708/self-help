package com.smart.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;



import com.smart.Services.PatientService;
import com.smart.entities.Quiz;

import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class PatientQuizController{
    private static final String APPLICATION_JSON_VALUE = null;
    @Autowired
    private PatientService patientService;

    public PatientQuizController(PatientService patientService) {
        super();
        this.patientService = patientService;
    }

    @PostMapping("/response")

    public void registerAccount(@ModelAttribute("patient") Quiz quiz)
    {
        patientService.save(quiz);

    }
}
