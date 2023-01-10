package Structure.Adapter._01_After;

import Structure.Adapter._01_After.security.UserDetails;
import Structure.Adapter._01_After.security.UserDetailsService;

public class AccountServiceAdapter implements UserDetailsService {

    private AccountService accountService;

    public AccountServiceAdapter(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account result = accountService.findAccountByUsername(username);
        return new AccountAdapter(result);
    }
}
