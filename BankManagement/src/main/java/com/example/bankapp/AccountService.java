package com.example.bankapp;

import java.util.List;

public interface AccountService {
   public Account createAccount(Account account);
   public Account getAccountDetailsByAccountNumber(Long accountNumber);
   public List<Account> getAllAccountDetails();
   public Account depositamount(Long accountNumber, Double amount);
   public Account withdrawAmount(Long accountNumber,Double amount);
   public void closeAccount(Long accountNumber);
}
