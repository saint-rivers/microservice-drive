package com.saintrivers.drive.folder.model.request;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class FolderRequest {

    @JsonPropertyOrder(value = "1")
    private String name;

    @JsonPropertyOrder(value = "2")
    private UUID parentId;

    @JsonIgnore
    private Date dateCreated;
}
