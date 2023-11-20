package com.todotic.operationms.operations.controller;

import com.todotic.operationms.operations.dto.OperationRequest;
import com.todotic.operationms.operations.dto.OperationResponse;
import com.todotic.operationms.operations.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
@RequiredArgsConstructor
public class OperationController {
    private final OperationService operationService;

    @PostMapping
    public ResponseEntity<OperationResponse> makeOperation(@RequestBody OperationRequest operationRequest) {
        return new ResponseEntity<>(operationService.makeOperation(operationRequest), HttpStatus.CREATED);
    }
}
