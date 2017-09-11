package fr.si2m.dsn.oss.cucumber.stepdefs;

import fr.si2m.dsn.oss.OssApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OssApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
