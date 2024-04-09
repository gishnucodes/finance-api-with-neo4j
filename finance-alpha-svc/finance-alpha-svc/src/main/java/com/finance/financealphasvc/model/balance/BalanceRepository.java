package com.finance.financealphasvc.model.balance;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "balance", path = "balance")
public interface BalanceRepository extends PagingAndSortingRepository<Balance, Long>, CrudRepository<Balance, Long> {

    Balance findById(@Param("id") String id);

    Balance findByBalanceId(@Param("balanceId") String balanceId);

}