package fr.r6a06;

public class PriceBuilder {
    private int priceCode;

    public PriceBuilder withPriceCode(int priceCode) {
        this.priceCode = priceCode;
        return this;
    }

    public Price build() {
        switch (priceCode) {
            case Movie.REGULAR:
                return new RegularPrice();
            case Movie.NEW_RELEASE:
                return new NewReleasePrice();
            case Movie.CHILDREN:
                return new ChildrenPrice();
            default:
                throw new IllegalArgumentException("Invalid price code");
        }
    }
}
