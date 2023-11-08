package com.t1consulting.stringapi.web;

import com.t1consulting.stringapi.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/string")
public class StringRestController {

    @Autowired
    private StringService service;

    @PostMapping
    public String getCountedSymbols (@Validated @RequestBody String string) {
        return service.getCountedSymbols(string);
    }
}
