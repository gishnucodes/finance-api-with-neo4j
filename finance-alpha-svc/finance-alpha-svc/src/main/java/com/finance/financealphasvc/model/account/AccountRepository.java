package com.finance.financealphasvc.model.account;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "account", path = "account")
public interface AccountRepository extends PagingAndSortingRepository<Account, Long>, CrudRepository<Account, Long> {

  List<Account> findByAccountId(@Param("accountId") String accountId);

}