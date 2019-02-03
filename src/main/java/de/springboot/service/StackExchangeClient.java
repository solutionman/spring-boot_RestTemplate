package de.springboot.service;

import de.springboot.model.SiteDto;
import de.springboot.model.SitesDto;
import de.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class StackExchangeClient {
    private RestTemplate restTemplate = new RestTemplate();

    public List<SiteDto> getSites() {
        String url = "https://api.stackexchange.com/2.2/sites?page=1&pagesize=9999&filter=!)QmCwY51ivjfd_pA.icNAOWD";

        try {
            SitesDto response = restTemplate.getForObject(new URI(url), SitesDto.class);
            return response.getItems();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
