package com.finance.financealphasvc.model.transaction;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long>, CrudRepository<Transaction, Long> {

  List<Transaction> findById(@Param("id") String id);

  List<Transaction> findByTransactionId(@Param("transactionId") String transactionId);

}