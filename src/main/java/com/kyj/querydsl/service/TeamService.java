package com.kyj.querydsl.service;

import com.kyj.querydsl.entity.People;
import com.kyj.querydsl.entity.Team;
import com.kyj.querydsl.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
  private final TeamRepository teamRepository;

  @Autowired
  public TeamService(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }

  public Team save(Team team) {
    return teamRepository.save(team);
  }

}
