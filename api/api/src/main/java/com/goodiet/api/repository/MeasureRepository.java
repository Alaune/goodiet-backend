package com.goodiet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodiet.api.domain.Measure;

public interface MeasureRepository extends JpaRepository<Measure, Long> {

}
