package com.saintrivers.driveservice.folder;


import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FolderService {

    Flux<Folder> findAll();

    Mono<Folder> findAllByFolderId(String folderId);

    Mono<Folder> addFolder(FolderRequest body);
}
