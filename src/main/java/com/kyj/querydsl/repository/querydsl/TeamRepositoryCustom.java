package com.kyj.querydsl.repository.querydsl;

import com.kyj.querydsl.entity.Team;

import java.util.List;

public interface TeamRepositoryCustom {
  List<Team> findAllCustom();
}
