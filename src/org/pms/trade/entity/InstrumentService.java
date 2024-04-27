package org.pms.trade.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
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
