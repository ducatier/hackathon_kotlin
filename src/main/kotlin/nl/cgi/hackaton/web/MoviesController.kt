package nl.cgi.hackaton.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MoviesController{

    @GetMapping("/movies")
    fun getMovies() = ""

}