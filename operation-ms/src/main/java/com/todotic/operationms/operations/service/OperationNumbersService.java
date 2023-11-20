package com.todotic.operationms.operations.service;

import com.todotic.operationms.operations.dto.OperationRequest;

public interface OperationNumbersService {
    Boolean canBeApplied(OperationRequest operationRequest);
    Double makeOperation(OperationRequest operationRequest);
}
