package tdd.howto.linesh.tw.fizzbuzzwhizz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameRuleConfigTest {

    private GameRuleConfig gameRuleConfig;

    @BeforeEach
    void setUp() {
        gameRuleConfig = new GameRuleConfig();
    }

    @Test
    void should_get_first_special_number_3_as_configured() {
        gameRuleConfig.setFirstSpecialNumber(3);

        assertEquals(3, gameRuleConfig.getFirstSpecialNumber());
    }

    @Test
    void should_get_second_special_number_5_as_configured() {
        gameRuleConfig.setSecondSpecialNumber(5);

        assertEquals(5, gameRuleConfig.getSecondSpecialNumber());
    }
}