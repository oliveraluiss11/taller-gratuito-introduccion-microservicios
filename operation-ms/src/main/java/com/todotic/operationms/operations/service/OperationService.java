package com.todotic.operationms.operations.service;

import com.todotic.operationms.operations.dto.OperationRequest;
import com.todotic.operationms.operations.dto.OperationResponse;

public interface OperationService {
    OperationResponse makeOperation(OperationRequest request);
}
