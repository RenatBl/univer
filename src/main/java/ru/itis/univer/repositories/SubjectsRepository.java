package ru.itis.univer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.univer.models.Subject;

public interface SubjectsRepository extends JpaRepository<Subject, Long> {

}
