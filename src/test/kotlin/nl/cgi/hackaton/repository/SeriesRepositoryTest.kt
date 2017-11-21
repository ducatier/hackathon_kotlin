package nl.cgi.hackaton.repository

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import nl.cgi.hackaton.domain.Series
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class SeriesRepositoryTest {

    @Autowired
    lateinit var seriesRepository: SeriesRepository

    @Before
    fun setupTestDatabase() {
            seriesRepository.save(TEST_SERIES_1)
            seriesRepository.save(TEST_SERIES_2)
    }

    companion object {
        val TEST_SERIES_1 = Series("The Big Bang Theory")
        val TEST_SERIES_2 = Series("Knight Rider")
    }

    @Test
    fun testSeries() {

        // Verify that the numberOfSeries are as expected.
        val numberOfSeries = seriesRepository.count()
        assertEquals(4, numberOfSeries)

    }

}