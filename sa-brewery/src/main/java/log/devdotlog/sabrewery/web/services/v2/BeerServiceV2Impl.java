package log.devdotlog.sabrewery.web.services.v2;

import log.devdotlog.sabrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById() {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
