import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/instruments")
public class InstrumentController {

    private final InstrumentService instrumentService;

    @Autowired
    public InstrumentController(InstrumentService instrumentService) {
        this.instrumentService = instrumentService;
    }

    @PostMapping
    public ResponseEntity<InstrumentEntity> createInstrument(@RequestBody InstrumentEntity instrument) {
        InstrumentEntity savedInstrument = instrumentService.saveInstrument(instrument);
        return ResponseEntity.ok(savedInstrument);
    }

    @GetMapping("/{instrumentId}")
    public ResponseEntity<InstrumentEntity> getInstrumentById(@PathVariable String instrumentId) {
        return instrumentService.getInstrumentById(instrumentId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<InstrumentEntity>> getAllInstruments() {
        List<InstrumentEntity> instruments = instrumentService.getAllInstruments();
        return ResponseEntity.ok(instruments);
    }

    @DeleteMapping("/{instrumentId}")
    public ResponseEntity<Void> deleteInstrumentById(@PathVariable String instrumentId) {
        instrumentService.deleteInstrumentById(instrumentId);
        return ResponseEntity.noContent().build();
    }
}
