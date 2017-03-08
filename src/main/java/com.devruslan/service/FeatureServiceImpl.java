package com.devruslan.service;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.entity.FeatureEntity;
import com.devruslan.domain.resource.FeatureResource;
import com.devruslan.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rus on 08.03.17.
 */
@Service
public class FeatureServiceImpl implements FeatureService {
    private final ConversionService conversionService;
    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureServiceImpl(final ConversionService conversionService,
                              final FeatureRepository featureRepository) {
        this.conversionService = conversionService;
        this.featureRepository = featureRepository;
    }

    @Override
    public void validate(FeatureDto dto) {
        // TODO: create realisation
    }

    @Override
    @Transactional
    public FeatureResource create(FeatureDto dto) {
        final FeatureEntity entity = conversionService.convert(dto, FeatureEntity.class);
        featureRepository.save(entity);
        return conversionService.convert(entity, FeatureResource.class);
    }
}
