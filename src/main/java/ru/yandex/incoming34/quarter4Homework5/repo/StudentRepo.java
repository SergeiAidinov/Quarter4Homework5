package ru.yandex.incoming34.quarter4Homework5.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.quarter4Homework5.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "UPDATE student SET mark = :mark WHERE id = :id")
	void setMark(@Param("id") int id, @Param("mark") String mark);

}
