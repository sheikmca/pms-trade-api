import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    private final PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping
    public ResponseEntity<PositionEntity> createPosition(@RequestBody PositionEntity position) {
        PositionEntity savedPosition = positionService.savePosition(position);
        return ResponseEntity.ok(savedPosition);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PositionEntity> getPositionById(@PathVariable String id) {
        return positionService.getPositionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<PositionEntity>> getAllPositions() {
        List<PositionEntity> positions = positionService.getAllPositions();
        return ResponseEntity.ok(positions);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePositionById(@PathVariable String id) {
        positionService.deletePositionById(id);
        return ResponseEntity.noContent().build();
    }
}
