package pers.yuriy;


@RequestMapping("/")
@RestController
public class SayController{

    @RequestMapping("hello")
    public void hello(String name){
        return "hello"+name;
    }
}