package com.openbanking.accounts_service.accounts_service;

import com.openbanking.accounts_service.accounts_entity.Accounts;
import com.openbanking.accounts_service.accounts_payload.AccountsResponse;
import com.openbanking.accounts_service.accounts_repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class AccountsService {
    @Autowired
    private AccountsRepository accountsRepository;

    public AccountsResponse getAccountById(BigInteger accountId) {
        Optional<Accounts> accountsOptional = accountsRepository.findById(accountId);

        if (accountsOptional.isPresent()) {
            Accounts accounts = accountsOptional.get();

            AccountsResponse response = new AccountsResponse();
            response.setAccountId(accounts.getAccountId());
            response.setAccountNumber(accounts.getAccountNumber());
            response.setAccountType(accounts.getAccountType());
            response.setCurrency(accounts.getCurrency());
            response.setStatus(accounts.getStatus());
            response.setOwnership(accounts.getOwnership());
            response.setCreatedAt(accounts.getCreatedAt());
            response.setCreatedDate(accounts.getCreatedDate());
            response.setUpdatedAt(accounts.getUpdatedAt());
            response.setLastUpdatedDate(accounts.getLastUpdatedDate());
            return response;
        } else {
            AccountsResponse response = new AccountsResponse();
            return response;
        }
    }
}
