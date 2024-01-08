package log.devdotlog.sabrewery.web.services;


import log.devdotlog.sabrewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById();

    BeerDto saveNewBeer(BeerDto beerDto);
}
