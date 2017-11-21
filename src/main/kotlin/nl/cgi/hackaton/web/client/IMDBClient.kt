package nl.cgi.hackaton.web.client

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import jdk.internal.org.objectweb.asm.TypeReference
import nl.cgi.hackaton.domain.Series
import org.springframework.stereotype.Component
import java.net.URL

@Component
class IMDBClient{

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class MovieDTO(
                        @JsonProperty("Title")
                         val Title: String,
                         @JsonProperty("imdbRating")
                        val imdbRating: String,
                         @JsonProperty("Poster")
                        val poster: String,
                         @JsonProperty("Year")
                        val Year: String,
                         @JsonProperty("Rated")
                        val Rated: String)

    fun getMovies(title:String): MovieDTO {

        val result = URL("http://www.omdbapi.com/?apikey=d03bb39b&type=series&t=The+Big+Bang+Theory").readText()

        val mapper = ObjectMapper().registerKotlinModule()
        val series: MovieDTO = mapper.readValue<MovieDTO>(result)
//        for (seriesItem in series){
//            println(seriesItem)
//        }
        return series;
    }

}
