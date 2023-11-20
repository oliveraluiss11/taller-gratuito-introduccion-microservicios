package com.todotic.operationms.operations.repository;

import com.todotic.operationms.operations.document.OperationDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperationRepository extends MongoRepository<OperationDocument, String> {
}
