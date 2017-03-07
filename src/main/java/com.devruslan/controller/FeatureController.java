package com.devruslan.controller;

import com.devruslan.domain.entity.FeatureEntity;
import com.devruslan.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.devruslan.controller.FeatureController.FEATURE_CONTROLLER_URL;

/**
 * Created by ruslan on 07.03.17.
 */
@RestController
@RequestMapping(FEATURE_CONTROLLER_URL)
public class FeatureController {
    public static final String FEATURE_CONTROLLER_URL = "/api/future";

    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureController(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    @RequestMapping(path = {"/all"}, method = {RequestMethod.GET})
    public ResponseEntity<List<FeatureEntity>> getFuture() {
        List<FeatureEntity> all = new ArrayList<>();
        featureRepository.findAll().forEach(all::add);

        return ResponseEntity.ok(all);
    }
}

