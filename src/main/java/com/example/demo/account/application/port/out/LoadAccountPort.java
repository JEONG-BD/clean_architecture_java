package com.example.demo.account.application.port.out;

import com.example.demo.account.domain.Account;
import com.example.demo.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
