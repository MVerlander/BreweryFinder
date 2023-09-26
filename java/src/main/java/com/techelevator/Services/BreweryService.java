package com.techelevator.Services;

import com.techelevator.dao.BreweryDao;
import com.techelevator.model.Brewery;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BreweryService {

    private BreweryDao breweryDao;

    public List<Brewery> getAllBreweries() {
        return breweryDao.getAllBreweries();
    }
    public Brewery getBrewery(int brewery_id) {
        return breweryDao.getBrewery(brewery_id);
    }

    public Brewery addBrewery(Brewery newBrewery) {
        return breweryDao.addBrewery(newBrewery);
    }

    public Brewery updateBrewery(Brewery updatedBrewery){
        return breweryDao.updateBrewery(updatedBrewery);
    }
}