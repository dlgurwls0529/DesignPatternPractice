package Structure.Adapter._01_After;

import Structure.Adapter._01_After.security.UserDetails;

public class AccountAdapter implements UserDetails {

    private Account account;

    public AccountAdapter(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
