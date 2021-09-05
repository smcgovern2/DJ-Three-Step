package edu.wctc.djthreestep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index.html";
    }
    @RequestMapping(value = "/stepone")
    public String showStepOne() {
        return "pages/stepone.html";
    }
    @RequestMapping("/steptwo")
    public String showStepTwo() {
        return "pages/steptwo.html";
    }
    @RequestMapping("/stepthree")
    public String showStepThree() {return "pages/stepthree.html"; }
}
