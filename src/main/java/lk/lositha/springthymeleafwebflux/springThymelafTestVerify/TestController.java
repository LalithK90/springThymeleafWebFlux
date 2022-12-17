package lk.lositha.springthymeleafwebflux.springThymelafTestVerify;


import lk.lositha.springthymeleafwebflux.databaseConnection.entity.MovieOne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


  List< MovieOne > movie = new ArrayList<MovieOne>();

  @RequestMapping( "/movie" )
  public String movies(Model model) {

    movie.add(MovieOne.builder().name("Polar (2019)").score(67).build());
    movie.add(MovieOne.builder().name("Iron Man (2008)").score(58).build());
    movie.add(MovieOne.builder().name("The Shawshank Redemption (1994)").score(68).build());
    movie.add(MovieOne.builder().name("Forrest Gump (1994)").score(97).build());
    movie.add(MovieOne.builder().name("Glass (2019)").score(68).build());
    model.addAttribute("movies", movie);
    return "movie";
  }


}

