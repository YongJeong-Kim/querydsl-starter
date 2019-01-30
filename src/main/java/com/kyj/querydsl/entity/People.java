package com.kyj.querydsl.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class People {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Integer age;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "team_id")
//  @JoinColumns({
//          @JoinColumn(name="team_id", referencedColumnName = "team_id")})
  private Team team;
}
