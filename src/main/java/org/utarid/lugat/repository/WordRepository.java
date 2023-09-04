package org.utarid.lugat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.utarid.lugat.entity.WordEntity;

public interface WordRepository extends JpaRepository<WordEntity, Long> {
    WordEntity findByWordAndIsActiveIsTrue(String word);
}
