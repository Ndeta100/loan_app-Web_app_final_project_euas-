package com.loan.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double loanAmount;
    private String loanType;
    private int duration;
    private double monthlyEMI;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Customer customer;
    @OneToMany(mappedBy = "loan",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions=new ArrayList<>();
}
