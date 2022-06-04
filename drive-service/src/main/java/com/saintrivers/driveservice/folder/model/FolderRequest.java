package com.saintrivers.driveservice.folder.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;


@Data
@NoArgsConstructor
@SuperBuilder
public class FolderRequest {
    @Schema(nullable = true)
    private UUID folderId;
    private String name;
}
