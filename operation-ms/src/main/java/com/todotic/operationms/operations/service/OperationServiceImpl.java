package com.todotic.operationms.operations.service;

import com.todotic.operationms.operations.document.OperationDocument;
import com.todotic.operationms.operations.dto.OperationRequest;
import com.todotic.operationms.operations.dto.OperationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {
    private final List<OperationNumbersService> operationNumbersServiceList;

    public OperationResponse makeOperation(OperationRequest request) {
        return operationNumbersServiceList
                .stream()
                .filter(operationType -> operationType.canBeApplied(request))
                .map(operationType -> operationType.makeOperation(request))
                .findFirst()
                .map(result -> OperationDocument
                        .builder()
                        .firstNumber(request.getFirstNumber())
                        .secondNumber(request.getSecondNumber())
                        .result(result)
                        .creationDate(LocalDateTime.now())
                        .type(request.getType())
                        .build())
                .map(document -> OperationResponse
                        .builder()
                        .result(document.getResult())
                        .message("Operación realizada exitosamente")
                        .build())
                .orElse(OperationResponse
                        .builder()
                        .message("Ocurrió un error al realizar la operación")
                        .build());
    }
}
