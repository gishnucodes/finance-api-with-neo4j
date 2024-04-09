package com.finance.financealphasvc.model.bank;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bank", path = "bank")
public interface BankRepository extends PagingAndSortingRepository<Bank, Long>, CrudRepository<Bank, Long> {

  Bank findByCode(@Param("code") String code);

  Bank findByName(@Param("name") String name);

}