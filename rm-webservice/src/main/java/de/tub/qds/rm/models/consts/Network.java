package de.tub.qds.rm.models.consts;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.tub.qds.rm.models.values.NetworkValue;

@Entity
public class Network implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	String networkMac;
	String networkName;
	String networkDisplayName;
	String networkIpv4;
	String networkIpv6;
	Long networkMtu;
	Long networkSpeed;
	@OneToMany(mappedBy = "networkValueId.networkValueNetwork", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Set<NetworkValue> networkValues;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "hardwareNetworks")
	Set<Hardware> networkHardware;

	public Network() {
	}

	public Network(String mac, String name, String displayName, String ipv4, String ipv6, Long mtu, Long speed) {
		super();
		this.networkMac = mac;
		this.networkName = name;
		this.networkDisplayName = displayName;
		this.networkIpv4 = ipv4;
		this.networkIpv6 = ipv6;
		this.networkMtu = mtu;
		this.networkSpeed = speed;
		this.networkValues = new HashSet<NetworkValue>();
		this.networkHardware = new HashSet<Hardware>();
	}

	public String getNetworkMac() {
		return networkMac;
	}

	public void setNetworkMac(String networkMac) {
		this.networkMac = networkMac;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getNetworkDisplayName() {
		return networkDisplayName;
	}

	public void setNetworkDisplayName(String networkDisplayName) {
		this.networkDisplayName = networkDisplayName;
	}

	public String getNetworkIpv4() {
		return networkIpv4;
	}

	public void setNetworkIpv4(String networkIpv4) {
		this.networkIpv4 = networkIpv4;
	}

	public String getNetworkIpv6() {
		return networkIpv6;
	}

	public void setNetworkIpv6(String networkIpv6) {
		this.networkIpv6 = networkIpv6;
	}

	public Long getNetworkMtu() {
		return networkMtu;
	}

	public void setNetworkMtu(Long networkMtu) {
		this.networkMtu = networkMtu;
	}

	public Long getNetworkSpeed() {
		return networkSpeed;
	}

	public void setNetworkSpeed(Long networkSpeed) {
		this.networkSpeed = networkSpeed;
	}

	@JsonIgnore
	public Set<NetworkValue> getNetworkValues() {
		return networkValues;
	}

	public void setNetworkValues(Set<NetworkValue> networkValues) {
		this.networkValues = networkValues;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JsonIgnore
	public Set<Hardware> getNetworkHardware() {
		return networkHardware;
	}

	public void addNetworkHardware(Hardware networkHardware) {
		this.networkHardware.add(networkHardware);
	}
	
	

}
