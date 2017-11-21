package nl.cgi.hackaton.repository

import nl.cgi.hackaton.domain.Movie
import nl.cgi.hackaton.domain.Series
import org.springframework.data.repository.CrudRepository

interface SeriesRepository : CrudRepository<Series, Long> {
    fun findByDescription(name: String): List<Series>
}
