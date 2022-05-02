package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.dto.SportDto;
import kz.mvp.keloyna.service.api.SportService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/sport")
@AllArgsConstructor
@CrossOrigin
public class SportController {
    private final SportService sportService;

    @GetMapping("/list")
    public ResponseEntity<List<SportDto>> getList(){
        return ResponseEntity.ok(sportService.getDtoList());
    }
}
