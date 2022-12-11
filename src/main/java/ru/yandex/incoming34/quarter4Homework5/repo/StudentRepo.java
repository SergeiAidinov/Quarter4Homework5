package ru.yandex.incoming34.quarter4Homework5.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.quarter4Homework5.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
