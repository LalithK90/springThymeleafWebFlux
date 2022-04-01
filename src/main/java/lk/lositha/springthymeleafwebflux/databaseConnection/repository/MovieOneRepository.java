package lk.lositha.springthymeleafwebflux.databaseConnection.repository;


import lk.lositha.springthymeleafwebflux.databaseConnection.entity.MovieOne;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface MovieOneRepository extends ReactiveCrudRepository<MovieOne, Long> {
    Flux<MovieOne> findByName(String name);
}