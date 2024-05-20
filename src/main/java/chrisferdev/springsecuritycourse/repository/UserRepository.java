package chrisferdev.springsecuritycourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.springsecuritycourse.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
