package com.kyj.querydsl.repository;

import com.kyj.querydsl.entity.People;
import com.kyj.querydsl.repository.querydsl.PeopleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Long>, PeopleRepositoryCustom {
  List<People> findByAge(@Param("age") Integer age);
}
