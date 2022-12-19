package com.pandero.account.controller;

import com.pandero.account.entity.Account;
import com.pandero.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1/account")
public class AccountController {

    @Autowired
    AccountService service;

    @PostMapping(value = "/save")
    Mono<Account> save(@RequestBody Account account){
        return service.insert(account);
    }

    @PutMapping(value = "/update")
    Mono<Account> update(@PathVariable(value = "id")Integer id, @RequestBody Account account){
        return service.update(id, account);
    }

    @DeleteMapping(value = "/delete/{id}")
    Mono<Void> delete(@PathVariable(value = "id")Integer id){
        return service.delete(id);
    }

    @GetMapping(value = "/list")
    Flux<Account> list(){
        return service.list();
    }

}
