package com.example.springbootdemo.Controller;
import com.example.springbootdemo.Model.User;
import org.springframework.web.bind.annotation.*;


@RestController

public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
    //@RequestMapping(value="/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public User user(){
        User user=new User();
        user.setId("1");
        user.setName("shabbir");
        user.setEmailId("shabbir@gmail.com");
        return user;
    }
    @GetMapping("/{id}/{id2}")
    public String pathvariable(@PathVariable String id,@PathVariable String id2){
     return "The pathvariable is:" + id + ":" + id2;
    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,@RequestParam(name ="email",required = false,defaultValue = "") String emailId){
     return "The name is: " + name + " and email id:" + emailId;
    }
}
