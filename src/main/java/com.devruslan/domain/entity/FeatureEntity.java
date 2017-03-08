package com.devruslan.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by ruslan on 07.03.17.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "feature")
public class FeatureEntity {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String renderingEngine;
    @NotNull
    private String browser;
    @NotNull
    private String platform;
    @NotNull
    private String engineVersion;
    @NotNull
    private String cssGrade;

    public FeatureEntity(String renderingEngine, String browser, String platform, String engineVersion, String cssGrade) {
        this.renderingEngine = renderingEngine;
        this.browser = browser;
        this.platform = platform;
        this.engineVersion = engineVersion;
        this.cssGrade = cssGrade;
    }
}
