package com.example.demo.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@RequiredArgsConstructor
public class Activity {

    @Getter
    private ActivityId id;

    @Getter
    @NonNull
    private Account.AccountId ownerAccountId;

    @Getter
    @NonNull
    private Account.AccountId sourceAccountId;

    @Getter
    @NonNull
    private Account.AccountId targetAccountId;

    @Getter
    @NonNull
    private LocalDateTime timestamp;

    @Getter
    @NonNull
    private Money money;

    public Activity(@NonNull  Account.AccountId ownerAccountId,
                    @NonNull  Account.AccountId sourceAccountId,
                    @NonNull  Account.AccountId targetAccountId,
                    @NonNull  LocalDateTime timestamp,
                    @NonNull  Money money) {
        this.id = null;
        this.ownerAccountId = ownerAccountId;
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.timestamp = timestamp;
        this.money = money;
    }



    @Value
    public static class ActivityId{
        private final Long id;
    }
}
