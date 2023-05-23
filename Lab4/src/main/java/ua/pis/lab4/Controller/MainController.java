package ua.pis.lab4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.pis.lab4.Implementation.MovieDAOImpl;
import ua.pis.lab4.Model.Movie;

import java.sql.Date;
import java.sql.SQLException;

@Controller
public class MainController {
    @Autowired
    private MovieDAOImpl movieDAO;

    @GetMapping("/")
    public String mainPage(Model model) throws SQLException, ClassNotFoundException {
        return "main";
    }

    @GetMapping("/showmovies")
    public String showMovies(Model model) throws SQLException, ClassNotFoundException {
        Iterable<Movie> movies = movieDAO.getAll();
        model.addAttribute("movies", movies);
        return "showMovies";
    }

    @GetMapping("/addmovie")
    public String addMovie(Model model) throws SQLException, ClassNotFoundException {
        return "addmovie";
    }

    @PostMapping("/addmovie")
    public String addMoviePost(@RequestParam String name, @RequestParam String director, @RequestParam int duration, Model model) throws SQLException {
        Date dateStart = Date.valueOf("2023-05-12");
        Date dateEnd = Date.valueOf("2023-05-30");
        Movie movie = new Movie(0, name, duration, director, null, dateStart, dateEnd);
        movieDAO.insert(movie);
        return "redirect:/";
    }

    @GetMapping("/showmovies/{movieId}/edit")
    public String editMovie(@PathVariable(value = "movieId")Integer id, Model model) throws SQLException {
//        if(!bookRepository.existsById(id)){
//            return "redirect:/";
//        }
        Movie movie = movieDAO.get(id);
        model.addAttribute("movie", movie);
        return "movieEdit";
    }

    @PostMapping("/showmovies/{movieId}/edit")
    public String SaveMovie(@PathVariable(value = "movieId")Integer id, @RequestParam String name, @RequestParam String director,@RequestParam int duration, Model model) throws SQLException {
        Movie movie = movieDAO.get(id);
        movie.setDirector(director);
        movie.setName(name);
        movie.setDuration(duration);
        movieDAO.update(movie);
        return "redirect:/showmovies";
    }

    @PostMapping("/showmovies/{movieId}/remove")
    public String RemoveMovie(@PathVariable(value = "movieId")Integer id, Model model) throws SQLException {
        Movie movie = movieDAO.get(id);
        movieDAO.delete(movie);
        return "redirect:/showmovies";
    }
}
