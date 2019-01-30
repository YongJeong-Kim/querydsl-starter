package com.kyj.querydsl.repository.querydsl;

import com.kyj.querydsl.dto.AllPerson;
import com.kyj.querydsl.entity.People;

import java.util.List;

public interface PeopleRepositoryCustom {
  List<People> findAllCustom();
  List<AllPerson> findLeftJoinByTeamId(Integer id);
}
