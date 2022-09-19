package ms.bnp.api.controller;

import lombok.RequiredArgsConstructor;
import ms.bnp.api.dto.request.MovementRequest;
import ms.bnp.persistence.entity.ManualMovementEntity;
import ms.bnp.persistence.service.MovementService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(MovementController.RESOURCE_PATH_MOVIMENTO)
@RequiredArgsConstructor
public class MovementController {

    public static final String RESOURCE_PATH_MOVIMENTO = "/movimento";

    private final MovementService movimentoService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String  createRealEstate(@RequestBody @Validated final MovementRequest request) {
        return movimentoService.create(request);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Object>> findAll() {

//        var response = movimentoService.findAll(), ManualMovementEntity[].class));
        return ResponseEntity.ok().body(Arrays.asList(movimentoService.findAll(), ManualMovementEntity[].class));
    }

}
