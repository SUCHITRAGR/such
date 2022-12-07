package Mystepdef;

import classfile.DemoQA;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.awt.*;

public class demoele {
    DemoQA da=new DemoQA();
    @Given("Elments fuctionality")
    public void elmentsFuctionality() throws AWTException, InterruptedException {
        da.LOGIN();
//      da.textbox();
    //  da.checkbox();

    }


    @Given("click on check box")
    public void clickOnCheckBox() throws InterruptedException {
     //  da.checkbox();
    }

    @Given("click on radio button")
    public void clickOnRadioButton() {
     //   da.radio();
    }
}

