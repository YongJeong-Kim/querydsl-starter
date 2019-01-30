package com.kyj.querydsl.repository.impl;

import com.kyj.querydsl.dto.AllPerson;
import com.kyj.querydsl.entity.People;
import com.kyj.querydsl.repository.querydsl.PeopleRepositoryCustom;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.sql.JPASQLQuery;
import com.querydsl.sql.SQLExpressions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.kyj.querydsl.entity.QPeople.people;
import static com.kyj.querydsl.entity.QTeam.team;

public class PeopleRepositoryImpl implements PeopleRepositoryCustom {
  private final JPAQueryFactory jpaQueryFactory;
  private final JPASQLQuery jpaSqlQuery;

  public PeopleRepositoryImpl(JPAQueryFactory jpaQueryFactory, JPASQLQuery jpaSqlQuery) {
    this.jpaQueryFactory = jpaQueryFactory;
    this.jpaSqlQuery = jpaSqlQuery;
  }

  @Override
  public List<People> findAllCustom() {
    return jpaQueryFactory.selectFrom(people).fetch();
  }

  @Override
  public List<AllPerson> findLeftJoinByTeamId(Integer id) {
    SQLExpressions.groupConcat(people.name, ",");
//    QPeople p = QPeople.people;
//    QTeam t = QTeam.team;
//    return jpaSqlQuery.select(Projections.fields(People.class,
//            people.id,
//            people.name))
//            .from(people)
//            .join(team)
//            .fetch();
//    jpaQueryFactory.update(people).set(people.id, 1L).execute();
    Collection<Long> where1 = Arrays.asList(1L,2L,3L);
    BooleanExpression where2 = team.id.eq(1L);
    BooleanExpression where3 = null;
    Expression<Long> e1 = Expressions.asNumber(33).longValue();
    Expression<String> e2 = Expressions.asString("a").stringValue();
//    CollectionExpression e3 = Arrays.asList(Expressions.asString("1").stringValue());
    BooleanBuilder where4 = new BooleanBuilder();
    where4.or(team.id.eq(1L));
    where4.or(team.id.eq(2L));
    JPAExpressions.selectFrom(people).where(people.id.eq(1L));
    return jpaQueryFactory
            .select(Projections.fields(AllPerson.class,
                    people.id,
                    people.name,
                    people.age,
                    people.team.id.as("team_id")))
            .from(people)
            .leftJoin(people.team, team)
//            .where(team.id.eq(1L))
//            .where(where2, where3)  // and
//            .where(team.id.eq(e1), team.id.eq(e1))
//            .where(where4)
//            .groupBy(team.id)
            .where(team.id.eq(1L))
      /*      .offset(1)
            .limit(3)*/
            .fetch();
  }
}
