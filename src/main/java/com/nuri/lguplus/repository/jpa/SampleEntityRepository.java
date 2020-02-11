package com.nuri.lguplus.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nuri.lguplus.entity.SampleEntity;

public interface SampleEntityRepository extends JpaRepository<SampleEntity, Long> {
	
}
