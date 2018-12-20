package org.digidoc4j.sample;

import org.digidoc4j.Configuration;
import org.digidoc4j.Container;
import org.digidoc4j.ContainerBuilder;
import org.digidoc4j.ContainerValidationResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestContainerValidationTests {

    Configuration configuration;

    @Before
    public void setUp() {
        configuration = Configuration.of(Configuration.Mode.TEST);
    }

}
