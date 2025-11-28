package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Teste {

    @Test
    void testarIgualdade() {

        int a = 1 + 2;

        assertEquals(3,a);
    }
}
