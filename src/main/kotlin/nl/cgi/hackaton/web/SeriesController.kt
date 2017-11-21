package nl.cgi.hackaton.web

import nl.cgi.hackaton.domain.Series
import nl.cgi.hackaton.repository.SeriesRepository
import org.springframework.web.bind.annotation.*


@RestController
class SeriesController(val repository: SeriesRepository){

    @GetMapping("/series")
    fun series(@RequestParam(name = "description", required = false) description: String?): MutableIterable<Series>? {

        if (description == null) {
            return repository.findAll();
        }

        return repository.findByDescription(description)

    }

    @GetMapping("/serie/{id}")
    fun findSerieById(@PathVariable id:Long)
            = repository.findOne(id)

    @PostMapping("/serie")
    fun postSerie(@RequestBody serie: Series) :String{

        repository.save(serie)

        return "succes"
    }

    @PutMapping("serie")
    fun putSerie(@RequestBody serie: Series) :String{
        repository.save(serie)
        return "succes"
    }

    @DeleteMapping("/series/{id}")
    fun deleteSerieById(@PathVariable id:Long) = repository.delete(id)

}