package com.devruslan.service;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.resource.FeatureResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rus on 08.03.17.
 */
@Service
public interface FeatureService {
    void validate(final FeatureDto dto);

    FeatureResource create(final FeatureDto dto);

    List<FeatureDto> getAll();

    FeatureResource update(Long featureId, FeatureDto featureDto);

    ResponseEntity getOne(Long featureId);
}
