package com.cartapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartapi.entities.Feedback;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback,Long>{

}
