import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PositionController {

    private final PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/positions")
    public ResponseEntity<List<PositionEntity>> getPositionsByTransactionRef(
            @RequestParam String transactionRef) {
        List<PositionEntity> positions = positionService.getPositionsByTransactionRef(transactionRef);
        return ResponseEntity.ok(positions);
    }
}
