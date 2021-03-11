package pako.soft.repository.test;

import pako.soft.entity.test.TestEntity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long> {
    List<TestEntity> findByName(String name);
}
