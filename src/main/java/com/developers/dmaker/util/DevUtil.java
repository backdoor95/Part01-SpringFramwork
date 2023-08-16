package com.developers.dmaker.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class DevUtil {

    public static void pringLog(){
        // 이렇게 날자 변환 , 숫자 변환할때 응용함. -> static 메서드 사용
        System.out.println(LocalDateTime.of(2021, 7, 21,3,15 ));
    }

    public static  void printNow(){
        System.out.println(LocalDateTime.now());
    }

}
