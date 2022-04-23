package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.dto.DocumentDto;
import kz.mvp.keloyna.entity.Document;
import kz.mvp.keloyna.service.base.BaseService;

public interface DocumentService extends BaseService<Document,Long> {
    void createDocument(DocumentDto dto);

    void editCompany(Long id, DocumentDto dto);
}
