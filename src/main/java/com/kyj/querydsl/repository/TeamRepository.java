package com.kyj.querydsl.repository;

import com.kyj.querydsl.entity.Team;
import com.kyj.querydsl.repository.querydsl.TeamRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long>, TeamRepositoryCustom {
}
