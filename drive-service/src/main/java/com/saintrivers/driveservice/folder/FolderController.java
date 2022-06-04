package com.saintrivers.driveservice.folder;


import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1/folders")
@RequiredArgsConstructor
public class FolderController {

    private final FolderService folderService;

    @Operation(summary = "wattt", responses = {
            @ApiResponse(description = "woot", responseCode = "202")
    })
    @GetMapping("/{id}")
    public Mono<Folder> getRootFolders(@PathVariable("id") String folderId) {
        return folderService.findAllByFolderId(folderId);
    }

    @PostMapping
    public Mono<Folder> createNewFolder(@RequestBody FolderRequest folderRequest) {
        return folderService.addFolder(folderRequest);
    }
}
