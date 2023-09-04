package org.utarid.lugat.service;

import org.springframework.stereotype.Service;
import org.utarid.lugat.entity.WordEntity;
import org.utarid.lugat.repository.WordRepository;

@Service
public class LugatServiceImpl implements LugatService {

    private final WordRepository wordRepository;

    public LugatServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public WordEntity getWord(String word) {
        return wordRepository.findByWordAndIsActiveIsTrue(word);
    }
}
