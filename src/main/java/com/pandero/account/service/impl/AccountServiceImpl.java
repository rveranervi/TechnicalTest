package com.pandero.account.service.impl;

import com.pandero.account.entity.Account;
import com.pandero.account.repository.AccountRepository;
import com.pandero.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository repository;

    @Override
    public Mono<Account> insert(Account account) {
        Account a = repository.save(account);
        switch (a.getAccountType()){
            case 1:
                // RUN SEND_EMAIL()
                break;
            case 2:
                // RUN SEND_EMAIL()
                // RUN PRIZE()
                break;
            case 3:
                // RUN SEND_EMAIL()
                // RUN PRIZE()
                // RUN BENEFIT()
                break;
            default:
                break;
        }
        return Mono.just(a);
    }

    @Override
    public Mono<Account> update(Integer id, Account account) {
        account.setId(id);
        return Mono.just(repository.save(account));
    }

    @Override
    public Mono<Void> delete(Integer id) {
        //return repository.deleteById(id);
        return Mono.just(null);
    }

    @Override
    public Flux<Account> list() {
        return Flux.fromIterable(repository.findAll());
    }

    @Override
    public Mono<Account> get(Integer id) {
        return Mono.just(repository.findById(id).orElse(new Account()));
    }
}
