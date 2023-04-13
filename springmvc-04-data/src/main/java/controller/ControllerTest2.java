package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    //采用restful风格，需要通过@PathVariable绑定参数
    //默认的请求类型是get方式，可用@GetMapping替代
    //此外还有post, put方式等

    //url：localhost:8999/hello4/{a}/{b}
    @RequestMapping("/hello4/{a}/{b}")
    public String sayHello(@PathVariable int a, @PathVariable int b, Model model){

        //在后台中取出前端的值
        System.out.println("a="+a+", b="+b);

        //将后台计算的结果返回到前端
        //通过Model，可以将后台计算的结果返回到前端
        int res = a + b;
        model.addAttribute("msg", res);

        //web-inf/jsp/test.jsp
        return "test";
    }

}
