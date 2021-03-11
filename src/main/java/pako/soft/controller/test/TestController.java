package pako.soft.controller.test;

import pako.soft.entity.test.TestEntity;
import pako.soft.repository.test.TestRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping(value = "/tests", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<TestEntity> getTests() {
        return testRepository.findAll();
    }
}
