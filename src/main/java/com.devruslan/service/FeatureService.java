package com.devruslan.service;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.resource.FeatureResource;
import org.springframework.stereotype.Service;

/**
 * Created by rus on 08.03.17.
 */
@Service
public interface FeatureService {
    void validate(final FeatureDto dto);

    FeatureResource create(final FeatureDto dto);
}
