package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    //url：localhost:8999/hello
    @RequestMapping("/hello")
    public String sayHello(Model model){

        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", "Hello, SpringMVC");

        //web-inf/jsp/test.jsp
        return "test";
    }
}
