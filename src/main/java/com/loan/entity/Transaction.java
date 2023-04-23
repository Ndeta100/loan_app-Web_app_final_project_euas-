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
    @Column(name = "time_stamp")
    private Timestamp transactionTime;
    @Column(name = "message")
    private  String message;
    @ManyToOne
    @JoinColumn(name = "loan_id",referencedColumnName = "id",insertable = false, updatable = false)
    private Loan loan;
}
