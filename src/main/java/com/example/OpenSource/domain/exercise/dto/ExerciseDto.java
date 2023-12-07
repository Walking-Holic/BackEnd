package com.example.OpenSource.domain.exercise.dto;

import com.example.OpenSource.domain.exercise.domain.Exercise;
import com.example.OpenSource.domain.member.domain.Member;
import java.time.LocalDate;
import lombok.Getter;

@Getter
public class ExerciseDto {
    private LocalDate date;
    private int steps;
    private int durationMinutes;
    private int caloriesBurned;

    public Exercise toEntity(Member member) {
        return Exercise.builder()
                .date(date)
                .steps(steps)
                .durationMinutes(durationMinutes)
                .caloriesBurned(caloriesBurned)
                .member(member)
                .build();
    }
}
