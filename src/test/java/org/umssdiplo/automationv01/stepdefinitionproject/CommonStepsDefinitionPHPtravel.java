package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.umssdiplo.automationv01.core.managepage.Base.BaseUtil;


public class CommonStepsDefinitionPHPtravel extends BaseUtil {

    private BaseUtil base;

    public CommonStepsDefinitionPHPtravel(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser");
        base.StepInfo = "ChromeDriver";
    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");
    }



}


