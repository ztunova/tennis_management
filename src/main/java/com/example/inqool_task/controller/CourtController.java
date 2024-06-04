package com.example.inqool_task.controller;

import com.example.inqool_task.data.dto.CourtDto;
import com.example.inqool_task.data.dto.CreateCourtDto;
import com.example.inqool_task.facade.CourtFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/court", produces = MediaType.APPLICATION_JSON_VALUE)
public class CourtController {

    private final CourtFacade courtFacade;

    @Autowired
    public CourtController(CourtFacade facade) {
        this.courtFacade = facade;
    }

    @PostMapping
    public ResponseEntity<CourtDto> createCourt(@RequestBody CreateCourtDto court) {
        return new ResponseEntity<>(courtFacade.create(court), HttpStatus.CREATED);
    }

}
