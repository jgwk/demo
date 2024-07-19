package jgwk.echo.home.support;

import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "hello jgwk";
    }

    @GetMapping("/echo")
    public String echoParam(@RequestParam(required = false) String value) {
        return "parameter [" + Strings.nullToEmpty(value) + "]";
    }


    @GetMapping("/echo/{value}")
    public String echoPath(@PathVariable String value) {
        return "path [" + value + "]";
    }
}
