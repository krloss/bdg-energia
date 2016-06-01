import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;

import static spark.Spark.get;
import spark.template.handlebars.HandlebarsTemplateEngine;

/**
 * Handlebars template engine example
 */
public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "Sam");

        // hello.hbs file is in resources/templates directory
        get("/hello", (rq, rs) -> new ModelAndView(map, "hello.hbs"), new HandlebarsTemplateEngine());
    }
}