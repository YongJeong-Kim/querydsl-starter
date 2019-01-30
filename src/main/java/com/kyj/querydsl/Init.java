package com.kyj.querydsl;

import com.kyj.querydsl.entity.People;
import com.kyj.querydsl.entity.Team;
import com.kyj.querydsl.service.PeopleService;
import com.kyj.querydsl.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Init {
  private final PeopleService peopleService;
  private final TeamService teamService;

  @Autowired
  public Init(PeopleService peopleService, TeamService teamService) {
    this.peopleService = peopleService;
    this.teamService = teamService;
  }

  @PostConstruct
  public void init() {
    Team t1 = Team.builder().name("A").build();
    Team t2 = Team.builder().name("B").build();
    teamService.save(t1);
    teamService.save(t2);

    People p1 = People.builder().name("aaa").age(11).team(t1).build();
    People p2 = People.builder().name("bbb").age(22).team(t1).build();
    People p3 = People.builder().name("ccc").age(33).team(t1).build();
    People p4 = People.builder().name("abc").age(44).team(t2).build();
    People p5 = People.builder().name("cde").age(55).team(t2).build();
    peopleService.save(p1);
    peopleService.save(p2);
    peopleService.save(p3);
    peopleService.save(p4);
    peopleService.save(p5);

  }
}
