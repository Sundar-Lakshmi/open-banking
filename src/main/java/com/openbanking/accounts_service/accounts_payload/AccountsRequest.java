package com.openbanking.accounts_service.accounts_payload;

import java.math.BigInteger;
import java.time.LocalDate;

public class AccountsRequest {

    private BigInteger accountId;

    public BigInteger getAccountId() {
        return accountId;
    }

    public void setAccountId(BigInteger accountId) {
        this.accountId = accountId;
    }
}