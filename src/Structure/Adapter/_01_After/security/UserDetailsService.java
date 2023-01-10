package Structure.Adapter._01_After.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
