package ru.yandex.incoming34.quarter4Homework5.components;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import ru.yandex.incoming34.quarter4Homework5.entity.Student;
import ru.yandex.incoming34.quarter4Homework5.repo.StudentRepo;

@RestController("/api/students")
public class Controller {

	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/allstudents")
	public Iterable<Student> allStudents() {
		return studentRepo.findAll();

	}

	@PutMapping("/setmark/{mark}")
	public Optional<Student> setMark(@Param(value = "id") int id,
			@PathVariable @Parameter(schema = @Schema(allowableValues = { "insufficient", "sufficient", "good",
					"perfect" })) String mark) {
		studentRepo.setMark(id, mark);
		return studentRepo.findById(id);

	}

	@GetMapping("/student/{id}")
	public Optional<Student> getStudentById(@Param(value = "id") int id) {

		return studentRepo.findById(id);

	}

}
