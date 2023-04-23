package com.loan.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp transactionTime;
    private  String message;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Loan loan;
}
