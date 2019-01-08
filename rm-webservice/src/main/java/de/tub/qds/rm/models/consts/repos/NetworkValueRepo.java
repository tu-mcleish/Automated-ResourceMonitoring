package de.tub.qds.rm.models.consts.repos;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;


import de.tub.qds.rm.models.values.NetworkValue;
import de.tub.qds.rm.models.values.pks.NetworkValuePK;

public interface NetworkValueRepo extends JpaRepository<NetworkValue, NetworkValuePK> {
	
	Set<NetworkValue> findByNetworkValueIdNetworkValueNetworkNetworkMacOrderByNetworkValueIdNetworkValueTimestampAsc(String networkMac);
	Set<NetworkValue> findByNetworkValueIdNetworkValueNetworkNetworkMacAndNetworkValueIdNetworkValueMeasurementId(String networkMac, Long measurementId);
	Set<NetworkValue> findByNetworkValueIdNetworkValueNetworkNetworkMacAndNetworkValueIdNetworkValueMeasurementIdOrderByNetworkValueIdNetworkValueTimestampAsc(String networkMac, Long measurementId);
	NetworkValue findTop1ByNetworkValueIdNetworkValueNetworkNetworkMacAndNetworkValueIdNetworkValueMeasurementIdOrderByNetworkValueIdNetworkValueTimestampAsc(String networkMac, Long measurementId);
	NetworkValue findTop1ByNetworkValueIdNetworkValueNetworkNetworkMacAndNetworkValueIdNetworkValueMeasurementIdOrderByNetworkValueIdNetworkValueTimestampDesc(String networkMac, Long measurementId);

}
