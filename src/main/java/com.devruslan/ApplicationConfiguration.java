package com.devruslan;

import com.devruslan.domain.entity.FeatureEntity;
import com.devruslan.repository.FeatureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by ruslan on 07.03.17.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

    @Bean
    public CommandLineRunner createStartData(FeatureRepository repository) {
        return (args) -> {
            repository.save(new FeatureEntity("Gecko", "Firefox 1.0", "Win 98+ / OSX.2+", "1.7", "A"));
            repository.save(new FeatureEntity("Gecko", "Firefox 1.5", "Win 98+ / OSX.2+", "1.8", "A"));
            repository.save(new FeatureEntity("Gecko", "Firefox 2.0", "Win 98+ / OSX.2+", "1.8", "A"));
            repository.save(new FeatureEntity("Gecko", "Camino 1.5", "OSX.3+", "1.8", "A"));
            repository.save(new FeatureEntity("Gecko", "Mozilla 1.6", "Win 98+ / OSX.1+", "1.6", "A"));
            repository.save(new FeatureEntity("KHTML", "Konqureror 3.1", "KDE 3.1", "3.1", "C"));
            repository.save(new FeatureEntity("Misc", "NetFront 3.4", "Embedded devices", "-", "C"));
            repository.save(new FeatureEntity("Presto", "Opera 7.0", "Win 95+ / OSX.1+", "-", "A"));
            repository.save(new FeatureEntity("Tasman", "Internet Explorer 4.5", "Mac OS 8-9", "-", "X"));
            repository.save(new FeatureEntity("Trident", "Internet Explorer 4.0", "Win 95+ 4", "-", "X"));
            repository.save(new FeatureEntity("Webkit", "Safari 1.2", "OSX.3", "125.5", "A"));
            repository.save(new FeatureEntity("Webkit", "S60", "S60", "413", "A"));
        };
    }
}
