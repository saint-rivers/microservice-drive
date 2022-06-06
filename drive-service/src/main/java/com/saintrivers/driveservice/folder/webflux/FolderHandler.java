package com.saintrivers.driveservice.folder.webflux;

import com.saintrivers.driveservice.folder.FolderService;
import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
//@RequiredArgsConstructor
class FolderHandler {

    private final FolderService folderService;

    FolderHandler(@Qualifier("folderServiceR2dbcImpl") FolderService folderService) {
        this.folderService = folderService;
    }

    @NonNull
    public Mono<ServerResponse> getFolderTreeByFolderId(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(
                        Mono.just(folderService.findAllByFolderId(request.pathVariable("id"))),
                        Folder.class
                );
    }

    @NonNull
    public Mono<ServerResponse> addFolder(ServerRequest request) {
        Mono<FolderRequest> body = request.body(BodyExtractors.toMono(FolderRequest.class));
        Mono<Folder> folder = folderService.addFolder(body.block());

        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(folder, Folder.class);
    }
}
