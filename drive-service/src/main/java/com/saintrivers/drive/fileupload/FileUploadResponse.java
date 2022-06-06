package com.saintrivers.drive.fileupload;

import com.saintrivers.drive.content.ContentUploadRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@SuperBuilder
public class FileUploadResponse extends ContentUploadRequest {

//    private String fileDisplayName;
//    private String generatedFileName;
}
