package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
