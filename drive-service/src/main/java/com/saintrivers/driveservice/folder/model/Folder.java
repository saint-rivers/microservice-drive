package com.saintrivers.driveservice.folder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@Table(name = "app_folders")
@Entity
@NoArgsConstructor
public class Folder {

    @Id
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "parent_id")
    private UUID parentId;

    @Column(name = "name")
    private String name;

    @OneToMany
    List<Folder> folders;

    @OneToMany(
            targetEntity = Content.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, orphanRemoval = true)
//    @JoinColumn(
//            name = "content",
//            table = "content",
//            foreignKey = @ForeignKey(name = "folder_id", foreignKeyDefinition = "folder_id"))
    List<Content> contentList;
}


