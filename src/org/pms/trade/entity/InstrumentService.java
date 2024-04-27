package org.pms.trade.entity;

public class InstrumentService {

    private final InstrumentRepository instrumentRepository;

    @Autowired
    public InstrumentService(InstrumentRepository instrumentRepository) {
        this.instrumentRepository = instrumentRepository;
    }

    public InstrumentEntity saveInstrument(InstrumentEntity instrument) {
        return instrumentRepository.save(instrument);
    }

    public Optional<InstrumentEntity> getInstrumentById(String instrumentId) {
        return instrumentRepository.findById(instrumentId);
    }

    public List<InstrumentEntity> getAllInstruments() {
        return instrumentRepository.findAll();
    }

    public void deleteInstrumentById(String instrumentId) {
        instrumentRepository.deleteById(instrumentId);
    }


}
