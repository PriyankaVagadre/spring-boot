package com.demo.spring;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${app.pageSize}")
      private int pageZise;

    @RequestMapping("/")
    public String index(){
        String viewName = getViewNAme();
        System.out.println(pageZise);
        return viewName;
    }

    public String getViewNAme(){
        return "index";
    }
}
