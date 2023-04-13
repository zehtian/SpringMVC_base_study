package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.User;


@Controller
public class ControllerTest1 {

    //url：localhost:8999/hello?a=1&b=2
    @RequestMapping("/hello")
    public String sayHello(int a, int b, Model model){

        //在后台中取出前端的值
        System.out.println("a="+a+", b="+b);

        //将后台计算的结果返回到前端
        //通过Model，可以将后台计算的结果返回到前端
        int res = a + b;
        model.addAttribute("msg", res);

        //web-inf/jsp/test.jsp
        return "test";
    }


    //若想url中输入的请求名称（即提交的域名称）和处理方法的参数名不一致
    //则需要添加注解@RequestParam
    //url：localhost:8999/hello2?num1=1&num2=2
    @RequestMapping("/hello2")
    public String sayHello2(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model){

        //在后台中取出前端的值
        System.out.println("a="+a+", b="+b);

        //将后台计算的结果返回到前端
        int res = a + b;
        model.addAttribute("msg", res);

        //web-inf/jsp/test.jsp
        return "test";
    }


    //若用户提交的参数是一个对象
    //url：localhost:8999/hello3?name=abc&id=1&age=15
    @RequestMapping("/hello3")
    public String sayHello3(User user){

        //在后台中取出前端的值
        System.out.println(user);

        //将后台计算的结果返回到前端
        //暂时不传了

        //web-inf/jsp/test.jsp
        return "test";
    }


}
