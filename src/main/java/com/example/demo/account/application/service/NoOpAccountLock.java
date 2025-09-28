package com.example.demo.account.application.service;

import com.example.demo.account.application.port.out.AccountLock;
import com.example.demo.account.domain.Account;
import org.springframework.stereotype.Component;

import static com.example.demo.account.domain.Account.*;

@Component
class NoOpAccountLock implements AccountLock {

    @Override
    public void lockAccount(AccountId accountId) {
        // do nothing
    }

    @Override
    public void releaseAccount(AccountId accountId) {
        // do nothing
    }

}
