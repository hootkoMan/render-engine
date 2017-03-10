package com.devruslan.service;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.entity.FeatureEntity;
import com.devruslan.domain.resource.FeatureResource;
import com.devruslan.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
//        validate(featureDto); //todo validate
        final FeatureEntity entity = conversionService.convert(dto, FeatureEntity.class);
        featureRepository.save(entity);
        return conversionService.convert(entity, FeatureResource.class);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FeatureDto> getAll() {
        final List<FeatureEntity> all = new ArrayList<>();
        featureRepository.findAll().forEach(all::add);
        return all.stream()
            .map(e -> conversionService.convert(e, FeatureDto.class))
            .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public FeatureResource update(Long featureId, FeatureDto featureDto) {
//        validate(featureDto);        //todo validate
        final FeatureEntity entity = featureRepository.findOne(featureId);
        return update(entity, featureDto);
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity getOne(Long featureId) {
        return featureRepository.exists(featureId)
            ? ResponseEntity.ok(conversionService.convert(featureRepository.findOne(featureId), FeatureDto.class))
            : new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    private FeatureResource update(final FeatureEntity entity, final FeatureDto dto) {
        entity.setBrowser(dto.getBrowser());
        entity.setCssGrade(dto.getCssGrade());
        entity.setEngineVersion(dto.getEngineVersion());
        entity.setPlatform(dto.getPlatform());
        entity.setRenderingEngine(dto.getRenderingEngine());
        featureRepository.save(entity);
        return conversionService.convert(entity, FeatureResource.class);
    }
}
