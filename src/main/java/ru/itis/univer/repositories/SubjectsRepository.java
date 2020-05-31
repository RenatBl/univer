package ru.itis.univer.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.itis.univer.models.Subject;
import ru.itis.univer.models.User;

import java.util.List;

public interface SubjectsRepository extends JpaRepository<Subject, Long> {
    List<Subject> findAllByStudents(List<User> students);

    @Query("from Subject subject where upper(subject.name) like concat('%', upper(:query), '%')")
    Page<Subject> search(@Param("query") String query,
                         Pageable pageable);
}
