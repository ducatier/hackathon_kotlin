package nl.cgi.hackaton.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SeriesController{


    @GetMapping("/series")
    fun series() = ""


}