package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.dto.CompanyDto;
import kz.mvp.keloyna.dto.DocumentDto;
import kz.mvp.keloyna.entity.Company;
import kz.mvp.keloyna.entity.Document;
import kz.mvp.keloyna.service.api.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/document")
@AllArgsConstructor
@CrossOrigin
public class DocumentController {
    private final DocumentService documentService;

    @PostMapping("/")
    public ResponseEntity<Void> createDocument(@RequestBody DocumentDto dto){
        documentService.createDocument(dto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Document> updateCompany(@RequestBody DocumentDto dto, @PathVariable Long id) {
        documentService.editCompany(id, dto);
        return ResponseEntity.ok().build();
    }

}
