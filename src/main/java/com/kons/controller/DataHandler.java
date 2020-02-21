package com.kons.controller;

import com.kons.repository.IHeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataHandler {

    @Autowired
    private IHeroMapper heroMapper;


}
