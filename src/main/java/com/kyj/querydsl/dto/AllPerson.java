package com.kyj.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllPerson {
  private String name;
  private Integer age;
  private Long team_id;
}
