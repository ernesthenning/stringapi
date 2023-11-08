package com.t1consulting.stringapi.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringServiceTest {
    private final StringService service = new StringService();

    @Test
    void getCountedSymbols() {
        assertAll("countedSymbols",
                () -> assertEquals("\"a\": 3", service.getCountedSymbols("aaa")),
                () -> assertEquals("You sent a null value", service.getCountedSymbols(null)),
                () -> assertEquals("You sent an empty string", service.getCountedSymbols("")));
    }


}