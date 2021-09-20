package com.sai.MovieBooking;

public class CountriesModel {
    private OneCountryModel country;
    private OneCountry updatedAt;

    public OneCountryModel getCountry() {
        return country;
    }

    public void setCountry(OneCountryModel country) {
        this.country = country;
    }

    public OneCountry getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OneCountry updatedAt) {
        this.updatedAt = updatedAt;
    }
}
