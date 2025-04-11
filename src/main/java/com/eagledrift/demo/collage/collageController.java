package com.eagledrift.demo.collage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collage")
public class collageController {

    @GetMapping("/studentget")
    public String getCollage(){
        return "this is My collage";
    }
}
