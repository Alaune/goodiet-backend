package com.goodiet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.api.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	public Category findByName(String name);
}
