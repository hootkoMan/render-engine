package com.devruslan.domain.resource;

import lombok.*;

/**
 * Created by ruslan on 08.03.17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FeatureResource {
    private Long id;
    private String renderingEngine;
    private String browser;
    private String platform;
    private String engineVersion;
    private String cssGrade;
}
