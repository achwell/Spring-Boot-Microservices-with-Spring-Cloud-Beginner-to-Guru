package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer
                    .builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(631234200036L)
                    .price(new BigDecimal(123.99))
                    .build());
            beerRepository.save(Beer
                    .builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(631234300019L)
                    .price(new BigDecimal(112.99))
                    .build());
            beerRepository.save(Beer
                    .builder()
                    .beerName("Pinball Porter")
                    .beerStyle("PORTER")
                    .quantityToBrew(200)
                    .upc(83783375213L)
                    .price(new BigDecimal(112.99))
                    .build());
            System.out.println("Loaded beers: " + beerRepository.count());
        }
    }
}
