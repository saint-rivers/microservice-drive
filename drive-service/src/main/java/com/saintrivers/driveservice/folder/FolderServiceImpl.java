package com.saintrivers.driveservice.folder;

import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FolderServiceImpl implements FolderService {

    private final FolderRepository folderRepository;
    private final ModelMapper modelMapper;

    @Override
    public Flux<Folder> findAll() {
        return null;
    }

    @Override
    public Mono<Folder> findAllByFolderId(String folderId) {
        Optional<Folder> folder = folderRepository.findById(UUID.fromString(folderId));
        return Mono.justOrEmpty(folder);
    }

    @Override
    public Mono<Folder> addFolder(FolderRequest body) {
        Folder folder = modelMapper.map(body, Folder.class);
        folder.setId(null);

        Folder savedFolder = folderRepository.save(folder);
        return Mono.just(savedFolder);
    }

}
