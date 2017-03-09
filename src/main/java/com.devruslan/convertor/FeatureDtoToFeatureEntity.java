package com.devruslan.convertor;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.entity.FeatureEntity;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ruslan on 09.03.17.
 */
public class FeatureDtoToFeatureEntity implements Converter<FeatureDto, FeatureEntity> {
    @Override
    public FeatureEntity convert(FeatureDto source) {
        FeatureEntity entity = new FeatureEntity();
        entity.setRenderingEngine(source.getRenderingEngine());
        entity.setBrowser(source.getBrowser());
        entity.setPlatform(source.getPlatform());
        entity.setEngineVersion(source.getEngineVersion());
        entity.setCssGrade(source.getCssGrade());
        return entity;
    }
}
