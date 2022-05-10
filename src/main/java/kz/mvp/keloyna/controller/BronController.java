package kz.mvp.keloyna.controller;

import kz.mvp.keloyna.dto.BookingDto;
import kz.mvp.keloyna.service.api.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/bron")
@AllArgsConstructor
@CrossOrigin
public class BronController {
    private final BookingService bookingService;

    @PostMapping("/save")
    public ResponseEntity<Void> saveRequest(@RequestBody BookingDto bookingDto){
        bookingService.saveRequest(bookingDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getByPlayground/{id}")
    public ResponseEntity<BookingDto> getBronsTime(@PathVariable Long id){
        return ResponseEntity.ok(bookingService.getRequests(id));
    }
}
