package sk.kasv.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String HelloWorld(){
        return "hello_world";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return"hello";
    }
    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String theName=request.getParameter("studentName");
        theName=theName.toUpperCase();
        String result="Yo! "+theName;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
