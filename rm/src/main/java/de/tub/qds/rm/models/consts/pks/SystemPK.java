package de.tub.qds.rm.models.consts.pks;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import de.tub.qds.rm.models.consts.Hardware;
import de.tub.qds.rm.models.consts.OperatingSystem;


@Embeddable
public class SystemPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String systemHostName;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	OperatingSystem systemOperatingSystem;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Hardware systemHardware;

	public SystemPK(){}

	public SystemPK(String hostName, OperatingSystem operatingSystem ,Hardware hardware) {
		super();
		this.systemHostName = hostName;
		this.systemOperatingSystem = operatingSystem;
		this.systemHardware = hardware;
	}



	public String getSystemHostName() {
		return systemHostName;
	}

	public OperatingSystem getSystemOperatingSystem() {
		return systemOperatingSystem;
	}

	public Hardware getSystemHardware() {
		return systemHardware;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setSystemHostName(String systemHostName) {
		this.systemHostName = systemHostName;
	}

	public void setSystemOperatingSystem(OperatingSystem systemOperatingSystem) {
		this.systemOperatingSystem = systemOperatingSystem;
	}

	public void setSystemHardware(Hardware systemHardware) {
		this.systemHardware = systemHardware;
	}

}
