package com.pandero.account.service;

import com.pandero.account.entity.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    public Mono<Account> insert(Account account);
    public Mono<Account> update(Integer id, Account account);
    public Mono<Void> delete(Integer id);
    public Flux<Account> list();
    public Mono<Account> get(Integer id);
}
