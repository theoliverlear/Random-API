package org.theoliverlear.randomnumberapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.theoliverlear.randomnumber.generator.DecNumberGenerator;

@SpringBootTest(classes = DecNumberGeneratorTest.class)
public class DecNumberGeneratorTest {
    DecNumberGenerator testDecGenerator = new DecNumberGenerator();
    @Test
    public void setTestDecGenerator() {
        System.out.println(testDecGenerator.getRandomNumber());
    }
}
