package com.example.demo.account.application.port.out;

import com.example.demo.account.domain.Account;

import static com.example.demo.account.domain.Account.*;

public interface AccountLock {

    void lockAccount(AccountId accountId);

    void releaseAccount(AccountId accountId);
}

