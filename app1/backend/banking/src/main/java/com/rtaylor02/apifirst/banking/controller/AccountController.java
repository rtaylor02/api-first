package com.rtaylor02.apifirst.banking.controller;

import com.rtaylor02.apifirst.banking.model.Account;
import com.rtaylor02.apifirst.banking.model.DepositRequest;
import org.openapitools.api.AccountApi;
import org.springframework.http.ResponseEntity;

/**
 * [Description]
 *
 * @Author: Rodney Taylor (u228616) on 19/10/2024
 */
public class AccountController implements AccountApi {
    @Override
    public ResponseEntity<Void> depositToAccount(DepositRequest depositRequest) {
        //Execute the business logic through Service/Utils/Repository classes
        return AccountApi.super.depositToAccount(depositRequest);
    }

    @Override
    public ResponseEntity<Account> getAccount() {
        //Execute the business logic through Service/Utils/Repository classes
        return AccountApi.super.getAccount();
    }
}
