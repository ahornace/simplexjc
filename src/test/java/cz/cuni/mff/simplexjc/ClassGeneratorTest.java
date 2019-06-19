package cz.cuni.mff.simplexjc;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ClassGeneratorTest {

    @Test
    public void simpleTest() throws IOException {
        assertEquals(IOUtils.toString(ClassGeneratorTest.class.getClassLoader().getResourceAsStream("simple.out"), "UTF-8"),
                ClassGenerator.generateClass(ClassGenerator.class.getClassLoader().getResourceAsStream("simple.xml")));
    }

}
