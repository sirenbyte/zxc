package kz.mvp.keloyna.controller.admin;

import io.swagger.annotations.Api;
import kz.mvp.keloyna.dto.AdminPanelCompanyDto;
import kz.mvp.keloyna.dto.ListDto;
import kz.mvp.keloyna.service.api.PlaygroundService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "API для админв")
@RestController
@RequestMapping("v1/api/admin")
@AllArgsConstructor
@CrossOrigin
public class AdminController {
    private final PlaygroundService playgroundService;

    @GetMapping("/list")
    public ResponseEntity<List<ListDto>> getList(){
        return ResponseEntity.ok(playgroundService.getList());
    }

    @PostMapping("/approve")
    public ResponseEntity<Void> approve(@RequestBody List<Long> list) {
        playgroundService.approve(list);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/disable")
    public ResponseEntity<Void> disable(@RequestBody List<Long> list) {
        playgroundService.disable(list);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/playground/{id}")
    public ResponseEntity<AdminPanelCompanyDto> getDetails(@PathVariable("id") Long id) {
        return ResponseEntity.ok(playgroundService.getDetails(id));
    }
}

