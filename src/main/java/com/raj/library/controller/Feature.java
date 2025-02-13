package com.raj.library.controller;

import com.raj.library.Service.FeatureService;
import com.raj.library.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feature")
public class Feature {
    @Autowired
    private FeatureService featureService;

    public ResponseEntity<List<Seller>> searchSellersByBook(@RequestBody)
}
