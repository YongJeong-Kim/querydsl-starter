package com.kyj.querydsl.repository.impl;

import com.kyj.querydsl.entity.Team;
import com.kyj.querydsl.repository.querydsl.TeamRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeamRepositoryImpl implements TeamRepositoryCustom {
//  private JPAQueryFactory jpaQueryFactory;
//
//  public TeamRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
//    this.jpaQueryFactory = jpaQueryFactory;
//  }

  @Override
  public List<Team> findAllCustom() {
//    jpaQueryFactory.select();
    return null;
  }
}
