package ru.jarinel.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.jarinel.client.core.ResourceProvider;

/**
 * Created by Jarinel on 06.12.2015.
 */

@Controller
public class IndexController {

    @Autowired
    private ResourceProvider resourceProvider;

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("message", resourceProvider.getMainResource().advanced());
        return "index";
    }

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public @ResponseBody String test() {
        return resourceProvider.getMainResource().advanced();
    }
}
