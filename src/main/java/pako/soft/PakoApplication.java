package pako.soft;

import pako.soft.entity.test.TestEntity;
import pako.soft.repository.test.TestRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PakoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PakoApplication.class);
    }

    @Bean
    public CommandLineRunner sampleData(TestRepository testRepository) {
        return (args -> {
            testRepository.save(new TestEntity("Maxim"));
            testRepository.save(new TestEntity("Nata"));
        });
    }
}
