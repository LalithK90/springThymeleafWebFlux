package lk.lositha.springthymeleafwebflux.repository;


import lk.lositha.springthymeleafwebflux.model.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

  Flux< Movie > findAll();

}