package com.saintrivers.drive.folder;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.saintrivers.drive.content.ContentResponse;
import com.saintrivers.drive.content.ContentUploadRequest;
import com.saintrivers.drive.folder.model.FolderTree;
import com.saintrivers.drive.folder.model.request.FolderRequest;
import com.saintrivers.drive.folder.model.response.FolderResponse;

public interface FolderService {

    FolderResponse findById(UUID id);

    FolderTree getFolderTree(UUID rootFolderId);

    FolderResponse createFolder(FolderRequest folderRequest);

    List<ContentResponse> insertContentToFile(ContentUploadRequest content) throws JsonProcessingException;

}
