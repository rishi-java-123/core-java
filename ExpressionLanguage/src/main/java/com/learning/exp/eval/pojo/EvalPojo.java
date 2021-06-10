package com.learning.exp.eval.pojo;

import lombok.*;

import java.util.List;
@Builder
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
public class EvalPojo {
    private List<String> condition;
    private String databaseName;
    private String tableName;
    private String schemaName;
    private String columnName;
    private int priority;
}
