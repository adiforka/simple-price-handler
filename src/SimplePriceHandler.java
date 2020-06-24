public class SimplePriceHandler {

    //could add simple multiplication of prices for same products bought multiple times
    //and subtraction for removing products from cart
    public String addPrices(String... prices) {
        int totalPriceCents = 0;
        for (String price : prices) {
            //actually forgot the parentheses around the parsing op below but a unit test indicated
            //a problem, so I found it here
            totalPriceCents += (int) (Double.parseDouble(price) * 100);
        }

        int dollars = totalPriceCents / 100;
        int cents = totalPriceCents % 100;

        String centsString = checkRemainder(cents);

        return String.format("%d.%s", dollars, centsString);
    }

    //getting the remainder of division by 100 on cents might swallow a 0 if the
    //amount returned < 10, so we do a check and add the 0 back if necessary (extracted
    //to a separate method to keep things cleaner
    private String checkRemainder(int cents) {
        String centsString;
        if (cents < 10) {
            centsString = 0 + Integer.toString(cents);
        } else centsString = Integer.toString(cents);
        return centsString;
    }
}

