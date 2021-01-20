package com.example.elk.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity // jpa에서 User 객체를 사용하기 위한 어노테이션
public class User {

  @Column
  private String id;

  @Column
  private String password;
  @Column
  private String name;
  @Column
  private int age;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long uid;

}
