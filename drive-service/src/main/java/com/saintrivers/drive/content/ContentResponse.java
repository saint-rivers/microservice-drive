package com.saintrivers.drive.content;

import com.saintrivers.drive.folder.model.enums.ContentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentResponse {

    private UUID id;
    private String displayName;
    private String resourceLocation;
    private ContentType type;
    
    private Date createdAt;
    private Date lastUpdated;
}
