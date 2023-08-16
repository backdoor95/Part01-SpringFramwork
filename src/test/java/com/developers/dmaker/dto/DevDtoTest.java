package com.developers.dmaker.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DevDtoTest {
    // live template => setting 을 키거나, ctrl alt s 단축키 => live template 검색

    @Test
    void test(){

//        DevDto devDto = new DevDto();
//
//        devDto.setName("snow");
//        devDto.setAge(21);
//        devDto.setStartAt(LocalDateTime.now());

        final DevDto devDto = DevDto.builder()
                .name("tomato")
                .age(21)
                .experienceYears(3)
                .startAt(LocalDateTime.now())
                .build();



        System.out.println(devDto);
        devDto.printLog();
    }
}