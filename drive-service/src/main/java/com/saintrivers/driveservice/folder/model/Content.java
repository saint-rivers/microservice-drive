package com.saintrivers.driveservice.folder.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@NoArgsConstructor
@Table("content")
public class Content {

    private UUID filename;
    private String displayName;
    private ContentType contentType;
}
