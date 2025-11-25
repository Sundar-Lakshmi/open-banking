package com.openbanking.accounts_service.accounts_repository;

import com.openbanking.accounts_service.accounts_entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, BigInteger> {
}
