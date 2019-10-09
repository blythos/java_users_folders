package com.codeclan.example.FileFolderUsers.components;

import com.codeclan.example.FileFolderUsers.models.File;
import com.codeclan.example.FileFolderUsers.models.Folder;
import com.codeclan.example.FileFolderUsers.models.User;
import com.codeclan.example.FileFolderUsers.repositories.FileRepository;
import com.codeclan.example.FileFolderUsers.repositories.FolderRepository;
import com.codeclan.example.FileFolderUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {

        User user = new User("Stephen");
        userRepository.save(user);

        User user1 = new User("Joe");
        userRepository.save(user1);

        Folder folder = new Folder("My Documents", user);
        folderRepository.save(folder);

        Folder folder1 = new Folder("My Documents", user1);
        folderRepository.save(folder1);

        File file = new File("My Secret Diary DO NOT READ", "doc", 1024, folder);
        fileRepository.save(file);
    }
}
