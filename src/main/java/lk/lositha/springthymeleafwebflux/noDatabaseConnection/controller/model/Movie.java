package lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

  private String name;
  private Integer score;

}