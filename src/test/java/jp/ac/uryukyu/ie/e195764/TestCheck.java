package jp.ac.uryukyu.ie.e195764;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCheck {

    String[] dataset = {"merchant\t商人",
            "needle\t針",
            "oxygen\t酸素",
            "diplomacy\t外交",
            "rainfall\t降雨",
            "structure\t構造",
            "herbivore\t草食動物",
            "lava\t溶岩",
            "investment\t投資",
            "fireplace\t暖炉"};
    @Test
    void testWords() {
        Check check = new Check(dataset);
        
    }
}