package com.openbanking.accounts_service.accounts_controller;

import com.openbanking.accounts_service.accounts_payload.AccountsResponse;
import com.openbanking.accounts_service.accounts_service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    AccountsService accountsService;

    @GetMapping("/{accountId}")
    public AccountsResponse getAccounts (@PathVariable BigInteger accountId){
        AccountsResponse accountsResponse=  accountsService.getAccountById(accountId);
        return accountsResponse;
    }
}
