package First.Spring.repository;


import First.Spring.controller.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    
}
