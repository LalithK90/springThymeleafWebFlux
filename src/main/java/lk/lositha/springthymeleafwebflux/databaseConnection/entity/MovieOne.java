package lk.lositha.springthymeleafwebflux.databaseConnection.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("movie_one")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieOne {
    @Id
    private int id;
    private String name;
    private int score;
}
