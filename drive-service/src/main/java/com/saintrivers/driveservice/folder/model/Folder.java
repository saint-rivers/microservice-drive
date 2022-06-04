package com.saintrivers.driveservice.folder.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;


@Table("app_folders")
@Data
@NoArgsConstructor
@SuperBuilder
public class Folder {

    @Id
    @Column("id")
    UUID id;

    @Column("parentId")
    UUID parentId;

    String name;
}
