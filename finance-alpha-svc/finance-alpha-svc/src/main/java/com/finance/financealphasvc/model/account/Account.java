package com.finance.financealphasvc.model.account;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.finance.financealphasvc.model.balance.Balance;
import com.finance.financealphasvc.model.transaction.Transaction;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
@Getter
@Setter
public class Account {

  @Id @GeneratedValue private Long id;

  private String accountId;

  private String bankName;

  @Relationship(type = "HAS_BALANCE")
  private Balance balance;

  private List<Transaction> transactions;

}