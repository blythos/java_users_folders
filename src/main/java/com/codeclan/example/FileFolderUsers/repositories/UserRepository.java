package com.codeclan.example.FileFolderUsers.repositories;

import com.codeclan.example.FileFolderUsers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
