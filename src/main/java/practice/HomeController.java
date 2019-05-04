package practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author urja
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return  "index.html";
    }
}
