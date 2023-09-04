package org.utarid.lugat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.utarid.lugat.entity.WordEntity;
import org.utarid.lugat.service.LugatService;
import org.utarid.lugat.service.LugatServiceImpl;

@RestController
@RequestMapping("/lugat/v1")
public class LugatController {

    LugatService lugatService;

    public LugatController(LugatServiceImpl lugatService) {
        this.lugatService = lugatService;
    }

    @GetMapping("/word/{word}")
    public WordEntity getWord(@PathVariable String word) {
        return lugatService.getWord(word);
    }

    @GetMapping("/version")
    public String getVersion() {
        return "1";
    }
}
