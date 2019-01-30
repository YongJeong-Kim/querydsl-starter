package com.kyj.querydsl.service;

import com.kyj.querydsl.dto.AllPerson;
import com.kyj.querydsl.entity.People;
import com.kyj.querydsl.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class PeopleService {
  private final PeopleRepository peopleRepository;

  @Autowired
  public PeopleService(PeopleRepository peopleRepository) {
    this.peopleRepository = peopleRepository;
  }

  public People save(People people) {
    return peopleRepository.save(people);
  }
  public List<People> findAllCustom() {
    return peopleRepository.findAllCustom();
  }

  public List<AllPerson> findByLeftJoinTeamId(Integer id) {
    return peopleRepository.findLeftJoinByTeamId(id);
  }
}
