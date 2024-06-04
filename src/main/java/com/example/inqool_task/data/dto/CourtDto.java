package com.example.inqool_task.data.dto;

import com.example.inqool_task.data.model.CourtSurface;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CourtDto {
    private Long id;
    private Long courtNumber;
    private CourtSurfaceDto surface;
}