package Structure.Adapter._01_Before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
