package com.devruslan.domain.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ruslan on 07.03.17.
 */
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class FeatureDto {
    private String renderingEngine;
    private String browser;
    private String platform;
    private String engineVersion;
    private String cssGrade;
}
