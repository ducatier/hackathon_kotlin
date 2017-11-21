package nl.cgi.hackaton.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController{

    @GetMapping("/helloworld")
    fun helloWorld(@RequestParam(value = "name", defaultValue = "world") name: String) = "hello , $name"

}