package nl.cgi.hackaton

import nl.cgi.hackaton.domain.Series
import nl.cgi.hackaton.repository.SeriesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

@SpringBootApplication
class DemoApplication{

    @Bean
    fun init(repository: SeriesRepository) = CommandLineRunner {
        val TEST_SERIES_1 = Series("The Big Bang Theory")
        val TEST_SERIES_2 = Series("Knight Rider")
        repository.save(TEST_SERIES_1)
        repository.save(TEST_SERIES_2)
    }
}

    fun main(args: Array<String>) {
        SpringApplication.run(DemoApplication::class.java, *args)
    }


