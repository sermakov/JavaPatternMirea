package ru.valkov.javaPattern.task12;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class FileService {
    @Value("${source:null}")
    private String source;
    @Value("${destination}")
    private String destination;

    @PostConstruct
    private void postConstruct() throws IOException {
        String content = "null".equals(source)
                ? "null" : FileUtils
                        .readFileToString(FileUtils.getFile(source), StandardCharsets.UTF_8);
        byte[] hash = DigestUtils.md5Digest(content.getBytes(StandardCharsets.UTF_8));
        FileUtils.writeByteArrayToFile(FileUtils.getFile(destination), hash);
    }

    @PreDestroy
    private void preDestroy() throws IOException {
        if (!"null".equals(source)) {
            FileUtils.delete(FileUtils.getFile(source));
        }
    }

    public void lol() {
        System.out.println("lol");
    }
}
