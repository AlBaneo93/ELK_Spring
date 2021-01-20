package com.example.elk.Repository;

import com.example.elk.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByIdAndPassword(String id, String password);
}
