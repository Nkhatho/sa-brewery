package log.devdotlog.sabrewery.web.services.impl;

import log.devdotlog.sabrewery.web.model.BeerDto;
import log.devdotlog.sabrewery.web.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo imp - update beer

        log.debug("Updating a beer ...");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer ...");
    }
}
