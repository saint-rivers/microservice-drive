package com.saintrivers.driveservice.folder;


import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1/folders")
//@RequiredArgsConstructor
public class FolderController {

    private final FolderService folderService;

    public FolderController(
            @Qualifier("folderServiceR2dbcImpl") FolderService folderService
    ) {
        this.folderService = folderService;
    }

    @GetMapping("/{id}")
    public Mono<Folder> getRootFolders(@PathVariable("id") String folderId) {
        return folderService.findAllByFolderId(folderId);
    }

    @PostMapping
    public Mono<Folder> createNewFolder(@RequestBody FolderRequest folderRequest) {
        return folderService.addFolder(folderRequest);
    }


}
