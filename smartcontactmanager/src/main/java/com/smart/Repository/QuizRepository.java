package com.smart.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer>{

}

