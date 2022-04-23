package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.dto.CompanyDto;
import kz.mvp.keloyna.dto.CompanyGetDto;
import kz.mvp.keloyna.dto.PlaygroundDto;
import kz.mvp.keloyna.entity.Company;
import kz.mvp.keloyna.entity.Playground;
import kz.mvp.keloyna.service.api.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/company")
@AllArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping("/registration")
    public ResponseEntity<Void> registration(@RequestBody CompanyDto dto){
        companyService.registration(dto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/disable/{id}")
    public ResponseEntity<Company> disableCompany(@PathVariable Long id) {
        companyService.disable(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@RequestBody CompanyDto dto, @PathVariable Long id) {
        companyService.editCompany(id, dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyGetDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.getCompany(id));
    }
}
