package com.codeclan.example.FileFolderUsers.repositories;

import com.codeclan.example.FileFolderUsers.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
