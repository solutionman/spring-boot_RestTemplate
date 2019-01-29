package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com","http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow (StackExchange)", "for professional and enthusiast programmers"));
        items.add(new StackoverflowWebsite("serverfault", "http://serverfault.com","http://cdn.sstatic.net/Sites/serverfault/img/favicon.ico", "Server Fault (StackExchange)", "for system and network administrators"));
    }

    public List<StackoverflowWebsite> findAll(){
        return items;
    }
}
