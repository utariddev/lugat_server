package org.utarid.lugat.service;

import org.springframework.stereotype.Service;
import org.utarid.lugat.entity.WordEntity;
import org.utarid.lugat.repository.WordRepository;

import java.util.List;

@Service
public class LugatServiceImpl implements LugatService {

    private final WordRepository wordRepository;

    public LugatServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public WordEntity getWord(String title) {
        List<WordEntity> wordEntities = wordRepository.findByTitlesContainingIgnoreCaseAndIsActiveIsTrue(title);

        for (WordEntity we : wordEntities) {
            String[] titlesArray = we.getTitles().split(",");
            for (String titles : titlesArray) {
                if (titles.equalsIgnoreCase(title)) {
                    return we;
                }
            }
        }
        return null;
    }
}
