package org.pms.trade.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PositionService {

    private final PositionRepository positionRepository;

    @Autowired
    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public PositionEntity savePosition(PositionEntity position) {
        return positionRepository.save(position);
    }

    public Optional<PositionEntity> getPositionById(String id) {
        return positionRepository.findById(id);
    }

    public List<PositionEntity> getAllPositions() {
        return positionRepository.findAll();
    }

    public void deletePositionById(String id) {
        positionRepository.deleteById(id);
    }
}

