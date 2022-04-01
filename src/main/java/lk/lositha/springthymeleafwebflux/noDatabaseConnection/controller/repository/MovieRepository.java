package lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.repository;


import lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.model.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

  Flux< Movie > findAll();

}