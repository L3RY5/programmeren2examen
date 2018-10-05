package com.realdolmen.examen.examenprogrammeren2.repositories;

import com.realdolmen.examen.examenprogrammeren2.repositories.MovieRepository;
import com.realdolmen.examen.examenprogrammeren2.domain.Movie;
import com.realdolmen.examen.examenprogrammeren2.exceptions.NoQueryPossibleException;
import java.sql.ResultSet;
import java.util.List;
import org.junit.Test;

import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MovieRepositoryTest {
    
    //TODO 
    //Opdracht 2 Unit testen : Er is al een deel van de repository test opgesteld. Alle gegevens die je nodig hebt staan al ingevuld.
    //19 : annoteer alle methoden met de juiste annotaties, zodat ze aanzien worden als test methoden. Boven sommige methoden staan tips, bekijk ze goed. 
    //20 : tracht alle methoden die hieronder beschreven zijn in te vullen zodat ze slagen. Tips kan je vinden in de methoden zelf.
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private MovieRepository repository;
    
    
    @Mock
    private ResultSet resultSet;

    @Before
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    
    //TODO maak een test voor MovieRepository.find()
     @Test
      public void findTestSucces() throws Exception {
        //Geef als parameter de String "SELECT * FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
        List<Movie>movie2=repository.find("SELECT * FROM movies");
        assertFalse(movie2.isEmpty());
        verifyNoMoreInteractions(movie2);
        
    }
    
    
    //TODO maak een test voor MovieRepository.find()
    @Test
    public void findTestWrongQueryThrowsNoQueryPossibleException() throws Exception{
        //Geef als parameter de String "SELECT tieeel FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
        List<Movie>movie2=repository.find("SELECT tieeel FROM movies");
        assertTrue(movie2.isEmpty());
        verifyNoMoreInteractions(movie2);
    }
    
    
    
}
