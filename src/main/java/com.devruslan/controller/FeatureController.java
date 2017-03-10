package com.devruslan.controller;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.resource.FeatureResource;
import com.devruslan.repository.FeatureRepository;
import com.devruslan.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = {RequestMethod.GET})
    public ResponseEntity<List<FeatureDto>> getAll() {
        return ResponseEntity.ok(featureService.getAll());
    }

    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity<FeatureResource> create(@RequestBody final FeatureDto featureDto) {
        final FeatureResource result = featureService.create(featureDto);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/{featureId}", method = {RequestMethod.PUT})
    public ResponseEntity<FeatureResource> update(@PathVariable("featureId") final Long featureId,
                                                  @RequestBody final FeatureDto featureDto) {
        FeatureResource update = featureService.update(featureId, featureDto);
        return ResponseEntity.ok(update);
    }
}

