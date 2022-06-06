package com.saintrivers.driveservice.folder;

import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FolderServiceR2dbcImpl implements FolderService {

    private final FolderRepository folderRepository;
    private final ModelMapper modelMapper;

    @Override
    public Flux<Folder> findAll() {
        return folderRepository.findAll();
    }

    @Override
    public Mono<Folder> findAllByFolderId(String folderId) {
        return folderRepository.findById(UUID.fromString(folderId));
    }

    @Override
    public Mono<Folder> addFolder(FolderRequest folderRequest) {
        Folder folder = modelMapper.map(folderRequest, Folder.class);
//        folder.setId(null);
        folder.setCreatedAt(LocalDateTime.now());
        return folderRepository.save(folder);
    }

}
