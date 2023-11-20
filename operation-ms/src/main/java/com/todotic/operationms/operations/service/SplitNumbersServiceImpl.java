package com.todotic.operationms.operations.service;

import com.todotic.operationms.operations.dto.OperationRequest;
import com.todotic.operationms.operations.util.OperationType;
import org.springframework.stereotype.Service;

@Service
public class SplitNumbersServiceImpl implements OperationNumbersService{
    @Override
    public Boolean canBeApplied(OperationRequest operationRequest) {
        return OperationType.SPLIT.name().equals(operationRequest.getType());
    }

    @Override
    public Double makeOperation(OperationRequest operationRequest) {
        Double a = operationRequest.getFirstNumber();
        Double b = operationRequest.getSecondNumber();
        if(b == 0) return null;
        return a/b;
    }
}
