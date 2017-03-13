package com.devruslan.convertor;

import com.devruslan.domain.entity.FeatureEntity;
import com.devruslan.domain.resource.FeatureResource;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ruslan on 09.03.17.
 */
public class FeatureEntityToFeatureResource implements Converter<FeatureEntity, FeatureResource> {
    @Override
    public FeatureResource convert(FeatureEntity source) {
        FeatureResource resource = new FeatureResource();
        resource.setId(source.getId());
        resource.setRenderingEngine(source.getRenderingEngine());
        resource.setBrowser(source.getBrowser());
        resource.setEngineVersion(source.getEngineVersion());
        resource.setCssGrade(source.getCssGrade());
        resource.setPlatform(source.getPlatform());
        return resource;
    }
}
