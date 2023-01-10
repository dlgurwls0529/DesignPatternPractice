package Structure.Adapter._01_After;

import Structure.Adapter._01_After.security.LoginHandler;

public class Client {
    public static void main(String[] args) {
        LoginHandler loginHandler = new LoginHandler(
                new AccountServiceAdapter(
                        new AccountService()
                )
        );

        loginHandler.login("asdf", "asdf");
    }
}
