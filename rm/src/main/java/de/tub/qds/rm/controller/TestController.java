package de.tub.qds.rm.controller;

import java.sql.Date;
import java.util.Set;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import de.tub.qds.rm.models.consts.Baseboard;
import de.tub.qds.rm.models.consts.Firmware;
import de.tub.qds.rm.models.consts.Hardware;
import de.tub.qds.rm.models.consts.Measurement;
import de.tub.qds.rm.models.consts.Memory;
import de.tub.qds.rm.models.consts.OperatingSystem;
import de.tub.qds.rm.models.consts.Processor;
import de.tub.qds.rm.models.consts.System;
import de.tub.qds.rm.models.consts.SystemModel;
import de.tub.qds.rm.models.consts.pks.FirmwarePK;
import de.tub.qds.rm.models.consts.pks.HardwarePK;
import de.tub.qds.rm.models.consts.pks.OperatingSystemPK;
import de.tub.qds.rm.models.consts.pks.SystemPK;
import de.tub.qds.rm.models.consts.repos.BaseboardRepo;
import de.tub.qds.rm.models.consts.repos.DiskRepo;
import de.tub.qds.rm.models.consts.repos.FileStoreRepo;
import de.tub.qds.rm.models.consts.repos.FileSystemRepo;
import de.tub.qds.rm.models.consts.repos.FirmwareRepo;
import de.tub.qds.rm.models.consts.repos.HardwareDiskRepo;
import de.tub.qds.rm.models.consts.repos.HardwareNetworkRepo;
import de.tub.qds.rm.models.consts.repos.HardwareRepo;
import de.tub.qds.rm.models.consts.repos.MeasurementRepo;
import de.tub.qds.rm.models.consts.repos.MemoryRepo;
import de.tub.qds.rm.models.consts.repos.NetworkRepo;
import de.tub.qds.rm.models.consts.repos.OperatingSystemRepo;
import de.tub.qds.rm.models.consts.repos.ProcessRepo;
import de.tub.qds.rm.models.consts.repos.ProcessorRepo;
import de.tub.qds.rm.models.consts.repos.SystemModelRepo;
import de.tub.qds.rm.models.consts.repos.SystemRepo;
import de.tub.qds.rm.models.values.MemoryValue;

@RestController
public class TestController {
	
	@Autowired BaseboardRepo baseboardRepo;
	@Autowired DiskRepo diskRepo;
	@Autowired FileStoreRepo fileStoreRepo;
	@Autowired FileSystemRepo fileSystemRepo;
	@Autowired FirmwareRepo firmwareRepo;
	@Autowired HardwareDiskRepo hardwareDiskRepo;
	@Autowired HardwareNetworkRepo hardwareNetworkRepo;
	@Autowired HardwareRepo hardwareRepo;
	@Autowired MeasurementRepo measurementRepo;
	@Autowired MemoryRepo memoryRepo;
	@Autowired NetworkRepo networkRepo;
	@Autowired OperatingSystemRepo operatingSystemRepo;
	@Autowired ProcessRepo processRepo;
	@Autowired ProcessorRepo processorRepo;
	@Autowired SystemModelRepo systemModelRepo;
	@Autowired SystemRepo systemRepo;
	
	@RequestMapping("/createTestDataSet")
	public Measurement createTestDataSet(){
		/*Baseboard baseboard = new Baseboard();
		Disk disk = new Disk();
		FileStore fileStore = new FileStore();
		FileSystem fileSystem = new FileSystem();
		Firmware firmware = new Firmware();
		Hardware hardware = new Hardware();*/
		JSONObject obj = null;
		try {
			obj = Unirest.get("http://localhost:8090/systemInfo/hardware/memory").asJson().getBody().getObject();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Measurement measurement = new Measurement();
		OperatingSystem operatingSystem = new OperatingSystem(new OperatingSystemPK("Test", "1", "2", "3", "4"));
		operatingSystemRepo.save(operatingSystem);
		Memory memory = memoryRepo.save(new Memory(obj.getLong("total")));
		Firmware firmware = firmwareRepo.save(new Firmware(new FirmwarePK("1", "2", "3", "4", "5")));
		Baseboard baseboard = baseboardRepo.save(new Baseboard("1", "", "", ""));
		SystemModel systemModel = systemModelRepo.save(new SystemModel("1", "", ""));
		Processor processor = new Processor();
		processor.setProcessorId("1");
		processor = processorRepo.save(processor);
		Hardware hardware = hardwareRepo.save(new Hardware(new HardwarePK(firmware, processor, memory, baseboard, systemModel)));
		measurement.setMeasurementStartDate(new Date(java.lang.System.currentTimeMillis()));
		measurement.setMeasurementIsRunning(true);
		System system = new System();
		system.setSystemId(new SystemPK("localhost", operatingSystem, hardware));
		systemRepo.save(system);
		measurementRepo.save(measurement);
		return measurement;
	}
	
	@RequestMapping("/memory")
	public Set<MemoryValue> getValuesOfMemory(){
		return memoryRepo.findAll().get(0).getMemoryValues();
	}

}
