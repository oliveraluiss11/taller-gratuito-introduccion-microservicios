package com.todotic.operationms.operations.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document(collection = "operations")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OperationDocument {
    private String operationId;
    private Double firstNumber;
    private Double secondNumber;
    private Double result;
    private String type;
    private LocalDateTime creationDate;
}
