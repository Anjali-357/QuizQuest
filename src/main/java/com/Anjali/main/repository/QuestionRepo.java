package com.Anjali.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anjali.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}