package lk.lositha.springthymeleafwebflux.databaseConnection.controller;

import lk.lositha.springthymeleafwebflux.databaseConnection.entity.MovieOne;
import lk.lositha.springthymeleafwebflux.databaseConnection.repository.MovieOneRepository;
import lk.lositha.springthymeleafwebflux.noDatabaseConnection.controller.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieOneController {

  @Autowired
  private MovieOneRepository movieRepository;

  @RequestMapping("/movies")
  public String movies(Model model) {
    List< MovieOne > movie = new ArrayList<>();


    movie.add(
        MovieOne.builder().name("Polar (2019)").score(65).build());
    movie.add(MovieOne.builder().name("Iron Man (2008)").score(55).build());
    movie.add(MovieOne.builder().name("The Shawshank Redemption (1994)").score(65).build());
    movie.add(MovieOne.builder().name("Forrest Gump (1994)").score(95).build());
    movie.add(MovieOne.builder().name("Glass (2019)").score(69).build());
    movieRepository.saveAll(movie).subscribe();
    return "index";
  }

  @RequestMapping("/movieOne")
  public String index(final Model model) {


    // loads 1 and display 1, stream data, data driven mode.
    IReactiveDataDriverContextVariable reactiveDataDrivenMode =
        new ReactiveDataDriverContextVariable(movieRepository.findAll(), 1);

    model.addAttribute("movies", reactiveDataDrivenMode);

    // classic, wait repository loaded all and display it.
    //model.addAttribute("movies", movieRepository.findAll());

    return "index";

  }



}