package com.saintrivers.driveservice.folder;

import com.saintrivers.driveservice.folder.model.Folder;
import com.saintrivers.driveservice.folder.model.FolderRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class FolderServiceJpaImpl implements FolderService {

    private final FolderRepository folderRepository;
    private final ModelMapper modelMapper;

    @Override
    public Flux<Folder> findAll() {
        return null;
    }

    @Override
    public Mono<Folder> findAllByFolderId(String folderId) {
//        Optional<Folder> folder = folderRepository.findById(UUID.fromString(folderId));
//        return Mono.justOrEmpty(folder);
        return Mono.just(new Folder());
    }

    @Override
    public Mono<Folder> addFolder(FolderRequest body) {
//        Folder folder = modelMapper.map(body, Folder.class);
//        folder.setId(null);
//
//        if (body.getParentId() == null){
//            Folder result = folderRepository.save(folder);
//            return Mono.just(result);
//        }
//
//        Optional<Folder> parentFolder = folderRepository.findById(body.getParentId());
//        parentFolder.ifPresent(parent -> {
//            parent.getSubFolders().add(folder);
//            folderRepository.save(parent);
//        });
        return Mono.just(new Folder());
    }

}
