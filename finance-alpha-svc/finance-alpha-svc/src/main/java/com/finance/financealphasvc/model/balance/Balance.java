package com.finance.financealphasvc.model.balance;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
@Getter
@Setter
public class Balance {

  @Id @GeneratedValue private Long id;

  private String balanceId;

  private Float current;
  
  private Float previous;


}