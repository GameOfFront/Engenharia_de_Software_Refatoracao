import org.example.ScoreClassifier_Q1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreClassifierTest {

    @Test
    void testHighScore() {
        ScoreClassifier_Q1 classifier = new ScoreClassifier_Q1();
        assertEquals("ALTO", classifier.classify(20));
    }

    @Test
    void testRareCase() {
        ScoreClassifier_Q1 classifier = new ScoreClassifier_Q1();
        assertEquals("CASO RARO", classifier.classify(-9999));
    }

    @Test
    void testMediumScore() {
        ScoreClassifier_Q1 classifier = new ScoreClassifier_Q1();
        assertEquals("MÉDIO", classifier.classify(10));
    }

    @Test
    void testLowScore() {
        ScoreClassifier_Q1 classifier = new ScoreClassifier_Q1();
        assertEquals("BAIXO", classifier.classify(5));
    }
}
