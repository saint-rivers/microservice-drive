package com.saintrivers.driveservice.folder.model;

//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.experimental.SuperBuilder;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.UUID;
//
//@Getter
//@Setter
//@SuperBuilder
//@Table(name = "app_folders")
//@Entity
//@NoArgsConstructor
//public class Folder {
//
//    @Id
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "org.hibernate.id.UUIDGenerator")
//    @GeneratedValue(generator = "UUID")
//    @Column(name = "id", updatable = false, nullable = false)
//    private UUID id;
//
//    @Column(name = "name")
//    private String name;
//
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<Folder> subFolders;
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
//    private List<Content> contentList;
//
//}


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Table("app_folders")
public class Folder implements Persistable<UUID> {
    @Id
    private UUID id;

    @Column("name")
    private String name;

    @Column("parent_id")
    private UUID parentId;

    private LocalDateTime createdAt;

    @Override
    public boolean isNew() {
        return createdAt == null;
    }
}

