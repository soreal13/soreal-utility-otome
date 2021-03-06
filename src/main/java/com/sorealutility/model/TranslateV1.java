package com.sorealutility.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * 네이버 파파고 번역 API model
 */


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class TranslateV1 {

    private String filename;

    private String text;

    private String translatedText;

}
