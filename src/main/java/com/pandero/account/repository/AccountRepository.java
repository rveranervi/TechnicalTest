package com.pandero.account.repository;

import com.pandero.account.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository()
public interface AccountRepository extends CrudRepository<Account, Integer> {
}
