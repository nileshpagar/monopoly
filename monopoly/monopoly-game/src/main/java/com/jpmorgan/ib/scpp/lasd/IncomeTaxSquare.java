package com.jpmorgan.ib.scpp.lasd;

public class IncomeTaxSquare implements Square{


    public static final int SQUARE_POSITION =4;

    public static final int MAX_CASH_ON_SQUARE = 200;

    @Override
    public void landsOn(Player player) {

        deductTax(player);
        player.setCurrentSquare(this);
    }

    private void deductTax(Player player) {
        int currentCash = player.currentCash;
        int taxCash = calculateTaxAmount(currentCash);

        player.currentCash -= taxCash;
    }

    private int calculateTaxAmount(int currentCash) {
        int tenPercentOfCash = (int) (currentCash*.1);

        int taxCash = tenPercentOfCash;
        if(tenPercentOfCash - MAX_CASH_ON_SQUARE > 0){
            taxCash = MAX_CASH_ON_SQUARE;
        }
        return taxCash;
    }

    @Override
    public int getPosition() {
        return SQUARE_POSITION;
    }

}

