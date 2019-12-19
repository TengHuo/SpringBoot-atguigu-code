package teng.spring06datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teng.spring06datajpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
