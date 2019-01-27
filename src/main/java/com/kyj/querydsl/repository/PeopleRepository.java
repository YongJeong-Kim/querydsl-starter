package com.kyj.querydsl.repository;

import com.kyj.querydsl.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
