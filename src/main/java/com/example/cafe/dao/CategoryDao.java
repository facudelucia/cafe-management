package com.example.cafe.dao;

import java.util.List;
import com.example.cafe.POJO.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer>{

    List<Category> getAllCategory();

}
