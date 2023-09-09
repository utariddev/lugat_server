package org.utarid.lugat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.utarid.lugat.entity.WordEntity;

import java.util.List;

public interface WordRepository extends JpaRepository<WordEntity, Long> {

    List<WordEntity> findByTitlesContainingIgnoreCaseAndIsActiveIsTrue(String title);
}
