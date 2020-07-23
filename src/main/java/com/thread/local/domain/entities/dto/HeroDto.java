package com.thread.local.domain.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
//@AllArgsConstructor
@Builder
public class HeroDto {

    @Data
    @Builder
    public static class Skill {
        private String code;
        private int number;
        private String name;
        private String describe;
    }

    @Data
    @Builder
    public static class Position {
        private String code;
        private String name;
        private String en_name;
    }

    private String code;

    private String name;

    private String sex;

    private List<Position> positions;

    private List<Skill> skills;
}
