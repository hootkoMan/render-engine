package com.devruslan.controller;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.entity.FeatureEntity;
import com.devruslan.domain.resource.FeatureResource;
import com.devruslan.repository.FeatureRepository;
import com.devruslan.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.devruslan.controller.FeatureController.FEATURE_CONTROLLER_URL;

/**
 * Created by ruslan on 07.03.17.
 */
@RestController
@RequestMapping(FEATURE_CONTROLLER_URL)
public class FeatureController {
    public static final String FEATURE_CONTROLLER_URL = "/api/features";

    private final FeatureRepository featureRepository;
    private final FeatureService featureService;

    @Autowired
    public FeatureController(final FeatureRepository featureRepository,
                             final FeatureService featureService) {
        this.featureRepository = featureRepository;
        this.featureService = featureService;
    }

    @RequestMapping(path = {"/all"}, method = {RequestMethod.GET})
    public ResponseEntity<List<FeatureEntity>> getFuture() {
        List<FeatureEntity> all = new ArrayList<>();
        featureRepository.findAll().forEach(all::add);
        return ResponseEntity.ok(all);
    }

    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity<FeatureResource> create(@RequestBody final FeatureDto featureDto) {
//        featureService.validate(featureDto); //create realisation
        final FeatureResource result = featureService.create(featureDto);
        return ResponseEntity.ok(result);
    }
}

