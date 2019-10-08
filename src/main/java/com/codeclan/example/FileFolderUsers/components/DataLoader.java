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
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("User");
        userRepository.save(user1);

        User user2 = new User("User2");
        userRepository.save(user2);

        Folder folder = new Folder("Data", user1);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Words", user2);
        folderRepository.save(folder2);

        File file = new File("File", "txt", 40, folder);
        fileRepository.save(file);
    }
}
