package com.saintrivers.drive.folder.model;

//import java.time.Date;
//import java.time.DateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.saintrivers.drive.content.Content;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Folder {

    @JsonPropertyOrder(value = "1")
    private UUID id;
    @JsonPropertyOrder(value = "2")
    private UUID parentId;
    @JsonPropertyOrder(value = "3")
    private Integer nodeLevel;
    @JsonPropertyOrder(value = "4")
    private String name;
    private List<Content> content;
    private List<Folder> subFolders;
    private Integer deepestNodeLevel;
//    @JsonSerialize(using = DateTimeSerializer.class)
//    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date dateCreated;
//    @JsonSerialize(using = DateTimeSerializer.class)
//    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date lastUpdated;
}
