package com.learning.exp.pojo;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExpressionAction {

    private String resource;
    private int identifier;
    private List<?> actions;
}
