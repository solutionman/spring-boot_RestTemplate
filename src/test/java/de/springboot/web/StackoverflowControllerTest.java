package de.springboot.web;

import de.springboot.model.StackoverflowWebsite;
import de.springboot.service.StackoverflowService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class StackoverflowControllerTest {
    @Mock
    private StackoverflowService stackoverflowService;
    @InjectMocks
    StackoverflowController sut;

    @Test
    public void getListOfProviders() {
        List<StackoverflowWebsite> listOfProviders = sut.getListOfProviders();
    }
}