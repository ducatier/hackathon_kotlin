package nl.cgi.hackaton.repository

import nl.cgi.hackaton.domain.Series
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
abstract class SeriesRepositoryTest(val initializeTestData: Boolean = true) {

    @Autowired
    lateinit var seriesRepository: SeriesRepository

    @Before
    fun setupTestDatabase() {
        if (initializeTestData) {
            seriesRepository.save(TEST_SERIES_1)
            seriesRepository.save(TEST_SERIES_2)
        }
    }

    companion object {
        val TEST_SERIES_1 = Series("The Big Bang Theory")
        val TEST_SERIES_2 = Series("Knight Rider")
    }
}