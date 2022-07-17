package com.bootcamp.conectDDBB.model;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Coche {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Integer year;
  private String marcha;
  private String modelo;

}
