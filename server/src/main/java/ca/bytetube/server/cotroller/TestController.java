package ca.bytetube.server.cotroller;

import ca.bytetube.server.domain.Test;
import ca.bytetube.server.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;
//    @RequestMapping("/test")
//    public String test(){
//        return "System Test";
//    }

    @RequestMapping("/test")
    public List<Test> test() {
        return testService.list();
    }
}
