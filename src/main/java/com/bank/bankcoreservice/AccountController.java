
package com.bank.bankcoreservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable int id,
                                @RequestBody String name) {
        return "Account " + id + " updated to " + name;
    }
}
