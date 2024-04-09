package com.finance.financealphasvc.model.bank;

import com.finance.financealphasvc.model.account.Account;

import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.Getter;
import lombok.Setter;


@Node
@Setter
@Getter
public class Bank {

  @Id @GeneratedValue private Long id;

  private String name;
  private String code;

  @Relationship(type = "HOLDS")
  private List<Account> accounts;

}
