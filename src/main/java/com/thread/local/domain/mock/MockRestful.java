package com.thread.local.domain.mock;

import com.thread.local.domain.entities.dto.HeroDto;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MockRestful {

    public static final Map<String, HeroDto> HERO_MAP = new HashMap<String, HeroDto>() {
        {
            put("百里守约",
                    HeroDto.builder()
                        .code(UUID.randomUUID().toString())
                        .name("百里守约").sex("男")
                        .positions(
                            Arrays.asList(
                                HeroDto.Position.builder().code(UUID.randomUUID().toString()).name("射手").en_name("ARCHER").build()
                            )
                        )
                        .skills(
                            Arrays.asList(
                                HeroDto.Skill.builder().code(UUID.randomUUID().toString()).name("").build()
                            )
                        ).build());
        }
    };

    public HeroDto getHeroInfo(String heroName) {
        return null;
    }
}
