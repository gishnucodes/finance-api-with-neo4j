package com.finance.financealphasvc.model.transaction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
@NoArgsConstructor
public class Transaction {

  @Id @GeneratedValue private Long id;

  private String transactionId;
  private Boolean isCredit;
  private Boolean isDebt;

}