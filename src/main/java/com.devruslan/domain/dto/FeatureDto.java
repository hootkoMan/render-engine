package com.devruslan.domain.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by ruslan on 07.03.17.
 */
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class FeatureDto {
    @NotNull
    private String renderingEngine;
    @NotNull
    private String browser;
    @NotNull
    private String platform;
    private String engineVersion;
    @NotNull
    private String cssGrade;
}
