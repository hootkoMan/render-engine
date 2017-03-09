package com.devruslan.convertor;

import com.devruslan.domain.dto.FeatureDto;
import com.devruslan.domain.entity.FeatureEntity;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ruslan on 09.03.17.
 */
public class FeatureEntityToFeatureDto implements Converter<FeatureEntity, FeatureDto> {
    @Override
    public FeatureDto convert(FeatureEntity source) {
        FeatureDto dto = new FeatureDto();
        dto.setRenderingEngine(source.getRenderingEngine());
        dto.setEngineVersion(source.getEngineVersion());
        dto.setPlatform(source.getPlatform());
        dto.setBrowser(source.getBrowser());
        dto.setCssGrade(source.getCssGrade());
        return dto;
    }
}
