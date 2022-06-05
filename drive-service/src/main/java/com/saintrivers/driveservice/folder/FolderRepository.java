package com.saintrivers.driveservice.folder;

import com.saintrivers.driveservice.folder.model.Folder;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FolderRepository extends ReactiveCrudRepository<Folder, UUID> {

//    @Query("INSERT INTO app_folders (name, parent_id) " +
//            "VALUES (:#folder.name, :#folder.parentId) " +
//            "RETURNING *")
//    Mono<Folder> insertSubFolder(@Param("folder") FolderRequest folder);
}
