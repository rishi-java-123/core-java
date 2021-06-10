package com.learning.exp.pojo;

import lombok.*;

import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExpressionStatement {

    private String effect;
    private List<String> action;
    private List<String> resource;
    private List<String> condition;
}
