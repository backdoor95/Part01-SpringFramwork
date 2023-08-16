package com.developers.dmaker.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Slf4j // 간편하게 로거를 사용할 수 있다.

public class DevDto {
    //test code 생성 단축키 = shift ctrl t

    String name;
    // final은 처음부터 값이 들어가 있어야함.

    Integer age;
    Integer experienceYears;
    LocalDateTime startAt;

    public void printLog(){
        log.info(getName());
    }

}
