package fr.r6a06;

public class Movie {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    public int getPriceCode() {
        return _priceCode;
    }
    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    public String getTitle (){
        return _title;
    };

    public double getCharge(int dayRented) {
        double result = 0.0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (dayRented > 2) {
                    result += (dayRented - 2) * 1.5;
                }
                else{
                    break;
                }
            case NEW_RELEASE:
                result += dayRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (dayRented > 3) {
                    result += (dayRented - 3) * 1.5;
                }
                else {
                    break;
                }
        }
        return result;
    }
}