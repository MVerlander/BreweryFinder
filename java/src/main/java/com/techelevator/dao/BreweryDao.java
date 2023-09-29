package com.techelevator.dao;

import com.techelevator.model.Brewery;

import java.util.List;

public interface BreweryDao {

    public List<Brewery> getAllBreweries();
    public List<Brewery> getAllBreweriesByName(String query);
    public List<Brewery> getAllBreweriesByCity(String query);
    public List<Brewery> getAllBreweriesByZip(int query);
    public Brewery getBrewery(int brewery_id);

    public Brewery addBrewery(Brewery newBrewery);

    public Brewery updateBrewery(Brewery updatedBrewery);

    public void updateUserRoleToBrewer(Brewery brewery);

}
