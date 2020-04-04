package com.training.dumptest.controller;

import com.training.dumptest.model.OOMGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class OOMController {

    @GetMapping("/oom")
    @ResponseBody
    public String createOOM() throws Exception {
        new OOMGenerator().generateOOM();
        return "oom";
    }
}
