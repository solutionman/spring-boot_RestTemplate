package de.springboot.persistence;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StackoverflowWebsiteRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<StackoverflowWebsite> findAll(){
        return null;
    }
}
