package nl.cgi.hackaton.web

import com.nhaarman.mockito_kotlin.doReturn
import nl.cgi.hackaton.domain.Series
import nl.cgi.hackaton.repository.SeriesRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner
import kotlin.test.assertEquals


@RunWith(MockitoJUnitRunner::class)
class SeriesControllerTest{


    @InjectMocks
    lateinit var seriesController: SeriesController


    @Mock
    lateinit var seriesRepository: SeriesRepository

    @Test
    fun testHelloController() {

        val serie : Series = Series("bla", "blavla", 3)

        doReturn(serie).`when`(seriesRepository).findOne(3)

        val result = seriesController.findSerieById(3)

        Assert.assertNotNull(result)
        assertEquals("bla!", result.name)
    }

}