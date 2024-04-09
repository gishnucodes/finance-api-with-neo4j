package com.finance.financealphasvc.model.person;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.finance.financealphasvc.model.bank.Bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
@Getter
@Setter
@NoArgsConstructor
public class Person {

  @Id @GeneratedValue private Long id;

  private String firstName;
  private String lastName;

  @Relationship(type = "BANKS_WITH")
  private List<Bank> banks;

}