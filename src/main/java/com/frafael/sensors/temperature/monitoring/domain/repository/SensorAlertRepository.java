package com.frafael.sensors.temperature.monitoring.domain.repository;

import com.frafael.sensors.temperature.monitoring.domain.model.SensorAlert;
import com.frafael.sensors.temperature.monitoring.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorAlertRepository extends JpaRepository<SensorAlert, SensorId> {
}
