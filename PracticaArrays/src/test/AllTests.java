package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ NotaMaxima.class, NotaMedia.class, NotaMediana.class, NotaMinima.class })
public class AllTests {

}
