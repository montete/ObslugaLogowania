package obslugalogowania.tests;

import obslugalogowania.logowanie.DataValidator;
import obslugalogowania.xklasy.XDaneLogowania;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by monum_000 on 2015-11-17.
 */
public class DataValidatorTest {
    @Test
    public void DataValidatorTest(){
        XDaneLogowania daneTestowe = new XDaneLogowania("wiolka", "asdzor");

        DataValidator testujemy = new DataValidator(daneTestowe);
        assertEquals(testujemy.isValidated(),true);
    }
    @Test
    public void DataValidatorTest1(){
        XDaneLogowania daneTestowe = new XDaneLogowania("wiol%ka", "asdzor");

        DataValidator testujemy = new DataValidator(daneTestowe);
        assertEquals(testujemy.isValidated(),false);
    }
    @Test
    public void DataValidatorTest2(){
        XDaneLogowania daneTestowe = new XDaneLogowania("wiolka", "as*dzor");

        DataValidator testujemy = new DataValidator(daneTestowe);
        assertEquals(testujemy.isValidated(),false);
    }
}