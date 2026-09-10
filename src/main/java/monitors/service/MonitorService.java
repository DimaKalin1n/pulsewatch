package monitors.service;

import monitors.dto.MonitorCreateDto;
import monitors.model.Monitor;
import monitors.repository.MonitorRepository;
import org.springframework.stereotype.Service;

@Service
public class MonitorService {

    private final MonitorRepository monitorRepository;

    public MonitorService(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    private Monitor createMonitor(MonitorCreateDto){
        monitorRepository.save();
    }
}
