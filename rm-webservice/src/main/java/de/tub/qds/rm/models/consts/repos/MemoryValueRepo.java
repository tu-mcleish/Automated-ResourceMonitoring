package de.tub.qds.rm.models.consts.repos;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;


import de.tub.qds.rm.models.values.MemoryValue;
import de.tub.qds.rm.models.values.pks.MemoryValuePK;

public interface MemoryValueRepo extends JpaRepository<MemoryValue, MemoryValuePK> {
	
	Set<MemoryValue> findByMemoryValueIdMemoryValueMemoryMemoryTotalSpaceOrderByMemoryValueIdMemoryValueTimestampAsc(Long memoryTotalSpace);
	Set<MemoryValue> findByMemoryValueIdMemoryValueMemoryMemoryTotalSpaceAndMemoryValueIdMemoryValueMeasurementId(Long memoryTotalSpace, Long measurementId);
	Set<MemoryValue> findByMemoryValueIdMemoryValueMemoryMemoryTotalSpaceAndMemoryValueIdMemoryValueMeasurementIdOrderByMemoryValueIdMemoryValueTimestampAsc(Long memoryTotalSpace, Long measurementId);
	MemoryValue findTop1ByMemoryValueIdMemoryValueMemoryMemoryTotalSpaceAndMemoryValueIdMemoryValueMeasurementIdOrderByMemoryValueIdMemoryValueTimestampAsc(Long memoryTotalSpace, Long measurementId);
	MemoryValue findTop1ByMemoryValueIdMemoryValueMemoryMemoryTotalSpaceAndMemoryValueIdMemoryValueMeasurementIdOrderByMemoryValueIdMemoryValueTimestampDesc(Long memoryTotalSpace, Long measurementId);
}
