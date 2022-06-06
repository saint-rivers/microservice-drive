package com.saintrivers.driveservice.folder.model;

//import lombok.*;
//import org.hibernate.Hibernate;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.util.Objects;
//import java.util.UUID;
//
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@Table(name = "content")
//@Entity
//public class Content {
//
//    @Id
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "org.hibernate.id.UUIDGenerator")
//    @GeneratedValue(generator = "UUID")
//    @Column(name = "id", updatable = false, nullable = false)
//    private UUID id;
//
//    private String displayName;
//    private String resourceName;
//
//    @Enumerated(value = EnumType.STRING)
//    private ContentType contentType;
//}

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@NoArgsConstructor
@Table("content")
public class Content{
    @Id
    @Column("id")
    private UUID id;

    @Column("resource_name")
    private String resourceName;

    @Column("display_name")
    private String displayName;

    @Column("folder_id")
    private UUID folderId;
}
