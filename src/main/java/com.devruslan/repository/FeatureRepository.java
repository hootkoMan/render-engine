package com.devruslan.repository;

import com.devruslan.domain.entity.FeatureEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ruslan on 07.03.17.
 */
public interface FeatureRepository extends PagingAndSortingRepository<FeatureEntity, Long> {
}
