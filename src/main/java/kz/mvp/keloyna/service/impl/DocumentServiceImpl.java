package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.dto.DocumentDto;
import kz.mvp.keloyna.entity.Document;
import kz.mvp.keloyna.repository.DocumentRepository;
import kz.mvp.keloyna.service.api.DocumentService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import liquibase.pro.packaged.D;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl extends BaseServiceImpl<Document, Long, DocumentRepository> implements DocumentService {
    @Override
    public void createDocument(DocumentDto dto) {
        Document document = new Document();
        document.setCompanyDetailsId(dto.getCompanyDetailsId());
        document.setName(dto.getName());
        document.setUrl(dto.getUrl());
        save(document);
    }

    @Override
    public void editCompany(Long id, DocumentDto dto) {
        Document document = findOrThrowNotFound(id);
        document.setUrl(document.getUrl());
        document.setName(document.getName());
        edit(document);
    }
}
