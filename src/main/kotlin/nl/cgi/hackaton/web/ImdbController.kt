package nl.cgi.hackaton.web

import nl.cgi.hackaton.domain.Series
import nl.cgi.hackaton.repository.SeriesRepository
import nl.cgi.hackaton.web.client.IMDBClient
import org.springframework.web.bind.annotation.*


@RestController
class ImdbController(val imdbClient: IMDBClient){

    @GetMapping("/imdb")
    fun series(@RequestParam(name = "title", required = true) title: String): IMDBClient.MovieDTO {
        return imdbClient.getMovies(title)

    }

}