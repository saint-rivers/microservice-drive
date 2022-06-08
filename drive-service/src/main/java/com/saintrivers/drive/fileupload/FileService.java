package com.saintrivers.drive.fileupload;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    FileUploadResponse save(MultipartFile file) throws IOException;
}
