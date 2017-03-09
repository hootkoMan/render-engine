package com.devruslan;

import com.devruslan.data.DataLoader;
import com.devruslan.repository.FeatureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by ruslan on 07.03.17.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfiguration.class, args);
        FeatureRepository repository = context.getBean(FeatureRepository.class);
        if (repository.count() == 0) {
            context.getBean(DataLoader.class).addData(repository);
        }
    }
}
