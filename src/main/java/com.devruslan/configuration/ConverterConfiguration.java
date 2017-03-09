package com.devruslan.configuration;

import com.devruslan.convertor.FeatureDtoToFeatureEntity;
import com.devruslan.convertor.FeatureEntityToFeatureDto;
import com.devruslan.convertor.FeatureEntityToFeatureResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by ruslan on 09.03.17.
 */
@Configuration
public class ConverterConfiguration {
    @Bean
    public ConversionServiceFactoryBean conversionService() {
        final ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        final Set<Converter> converters = new HashSet<>();
        converters.add(new FeatureDtoToFeatureEntity());
        converters.add(new FeatureEntityToFeatureResource());
        converters.add(new FeatureEntityToFeatureDto());
        bean.setConverters(converters);
        return bean;
    }
}
