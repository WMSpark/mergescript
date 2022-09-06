package com.transferfunds.test.core;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.GenericXmlWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by saraswathir on 08/09/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = GenericXmlWebContextLoader.class,
        locations = "classpath:project-springapp-test.xml")
@WebAppConfiguration
public abstract class BaseTest {

}
