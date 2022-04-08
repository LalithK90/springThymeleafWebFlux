package lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.controller;

import lk.lositha.springthymeleafwebflux.databaseConnection.entity.MovieOne;
import lk.lositha.springthymeleafwebflux.databaseConnection.repository.MovieOneRepository;
import lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.model.Movie;
import lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieRestController {

  @Autowired
  private MovieRepository movieRepository;


@GetMapping(value = "/moviesList" ,produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux< Movie> getMovies() {
    return movieRepository.findAll();
  }
// tutorial link
  // https://howtodoinjava.com/spring-webflux/spring-webflux-tutorial/
}