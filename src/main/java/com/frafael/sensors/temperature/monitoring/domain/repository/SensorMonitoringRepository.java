package com.frafael.sensors.temperature.monitoring.domain.repository;

import com.frafael.sensors.temperature.monitoring.domain.model.SensorMonitoring;
import com.frafael.sensors.temperature.monitoring.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorMonitoringRepository extends JpaRepository<SensorMonitoring, SensorId> {
}
