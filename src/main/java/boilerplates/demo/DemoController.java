package boilerplates.demo;

import com.google.common.flogger.FluentLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @GetMapping("/")
    public String index() {
        logger.atInfo().log("getting request for %s", "/");
        return "Greetings from Spring Boot!";
    }
}