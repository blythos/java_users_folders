package com.codeclan.example.FileFolderUsers.repositories;

import com.codeclan.example.FileFolderUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
