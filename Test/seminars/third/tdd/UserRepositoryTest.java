package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void testLogoutNonAdminUsers() {
        UserRepository repository = new UserRepository();
        User adminUser = new User("admin", "admin_password", true);
        User regularUser = new User("regularUser", "regular_password", false);

        repository.addUser(adminUser);
        repository.addUser(regularUser);

        repository.logoutNonAdminUsers();

        assertTrue(repository.findByName("admin"));
        assertFalse(repository.findByName(regularUser.getName()));
    }

}