package obslugalogowania.tests;

import obslugalogowania.logowanie.Logowanie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by monum_000 on 2015-11-17.
 */
public class LogowanieTest {

    @Before
    public void setUp() throws Exception {


    }
    @Test
    public void CzyPolaWypelnioneTest1(){
        String login = "";
        String passwd ="cos";
        Logowanie test = new Logowanie(login, passwd);
        assertEquals(test.CzyPolaWypelnione(test.getDane()),false);
    }
    @Test
    public void CzyPolaWypelnioneTest2(){
        String login = "cos1";
        String passwd ="cos";
        Logowanie test = new Logowanie(login, passwd);
        assertEquals(test.CzyPolaWypelnione(test.getDane()),true);
    }


    @After
    public void tearDown() throws Exception {

    }
}