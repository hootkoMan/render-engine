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
@Table
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
    private String engineVersion;
    @NotNull
    private String cssGrade;
}
