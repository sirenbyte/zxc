package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.dto.PlaygroundDto;
import kz.mvp.keloyna.dto.PlaygroundFilterDto;
import kz.mvp.keloyna.dto.PlaygroundUpdateDto;
import kz.mvp.keloyna.dto.PlaygroundViewInListDto;
import kz.mvp.keloyna.entity.Company;
import kz.mvp.keloyna.entity.Playground;
import kz.mvp.keloyna.service.api.PlaygroundService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/playground")
@AllArgsConstructor
@CrossOrigin
public class PlaygroundController {
    private final PlaygroundService playgroundService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody PlaygroundDto playgroundDto){
        playgroundService.savePlayground(playgroundDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayground(@PathVariable("id") Long id){
        playgroundService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Playground> editPlayground(@RequestBody PlaygroundUpdateDto dto, @PathVariable Long id) {
        playgroundService.editPlayground(id, dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlaygroundDto> getPlaygroundById(@PathVariable Long id) {
        return ResponseEntity.ok(playgroundService.getPlayground(id));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Playground>> getAllPlayground() {
        return ResponseEntity.ok(playgroundService.getAll());
    }

    @PostMapping("/filter")
    public ResponseEntity<List<PlaygroundViewInListDto>> filter(@RequestBody PlaygroundFilterDto dto){
        return ResponseEntity.ok(playgroundService.filter(dto));
    }


}
