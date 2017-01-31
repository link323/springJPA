package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

//public interface ExerciseRepository {
//	
//	Exercise save (Exercise exercise);
//}


//teraz nie trzeba pisac implementacji save bo biblioteka spring data jpa posiada wbudowana implementacje
//extends JpaRepository<Exercise, Long> -> Exercise -nazwa klasy, Long - typ Id (@Id @GeneratedValue private Long Id;) z klasy Exercise
 

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{

}