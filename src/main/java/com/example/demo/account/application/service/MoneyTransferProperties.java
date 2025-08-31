package com.example.demo.account.application.service;

import com.example.demo.account.domain.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MoneyTransferProperties {
    public Money maximumTransferThreshold = Money.of(1_000_000);
}
