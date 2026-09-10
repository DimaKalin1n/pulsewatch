package monitors.controller;

import monitors.dto.MonitorCreateDto;
import monitors.model.Monitor;
import monitors.service.MonitorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    private final static String MONITOR_URL = "/api/monitors";

    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @PostMapping(MONITOR_URL)
    public Monitor createMonitor(@RequestBody MonitorCreateDto){
        return new Monitor();
    }
}
