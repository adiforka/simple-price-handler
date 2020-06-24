import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplePriceHandlerTest {

    SimplePriceHandler priceHandler;

    @BeforeEach
    void setUp() {
        priceHandler = new SimplePriceHandler();
    }

    @DisplayName("When prices added, should return expected total")
    @Test
    void testAddPrices() {
        //given
        String price1 = "9.99";
        String price2 = "10.09";
        String price3 = "15.99";

        //when
        String total = priceHandler.addPrices(price1, price2, price3);

        //then
        assertEquals("36.07", total);
    }
}