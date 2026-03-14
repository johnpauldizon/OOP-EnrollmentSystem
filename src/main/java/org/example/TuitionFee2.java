package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFee2Test {

    private TuitionFeePayment tuitionFeePayment;

    @BeforeEach
    void setup() {
        tuitionFeePayment = new TuitionFeePayment();
    }

    @Test
    @DisplayName("Test paying full tuition fee")
    void testPayFullTuition() {
        int result = tuitionFeePayment.pay(1000);
        assertEquals(1000, result, "Should pay full tuition fee");
    }

    @Test
    @Disabled("Not implemented yet")
    @DisplayName("Test paying partial tuition fee")
    void testPayPartialTuition() {
    }
}
