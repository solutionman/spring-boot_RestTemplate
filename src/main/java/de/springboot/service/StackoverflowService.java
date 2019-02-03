package de.springboot.service;

import com.google.common.collect.ImmutableList;
import de.springboot.model.SiteDto;
import de.springboot.model.StackoverflowWebsite;
import de.springboot.persistence.StackoverflowWebsiteRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

@Service
public class StackoverflowService {

    @Autowired
    private StackoverflowWebsiteRepository repository;
    @Autowired
    private StackExchangeClient stackExchangeClient;

    public List<StackoverflowWebsite> findAll(){
        return stackExchangeClient.getSites().stream()
                .map(this::toStackoverflowWebsite)
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    private StackoverflowWebsite toStackoverflowWebsite(@NonNull SiteDto input){
        return new StackoverflowWebsite(
                input.getSite_url().substring("https://".length(), input.getSite_url().length() - ".com".length()),
                input.getSite_url(),
                input.getFavicon_url(),
                input.getName(),
                input.getAudience());
    }

    /*public List<StackoverflowWebsite> findAll(){
        return repository.findAll();
    }*/
}
