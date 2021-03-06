package de.tub.qds.rm.models.values.pks;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.tub.qds.rm.models.consts.FileStore;

@Embeddable
public class FileStoreValuePK implements Serializable {

	private static final long serialVersionUID = 1L;
	@ManyToOne(targetEntity = FileStore.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	FileStore fileStoreValueFileStore;
	Long fileStoreValueMeasurementId;
	Timestamp fileStoreValueTimestamp;

	public FileStoreValuePK() {
	}

	public FileStoreValuePK(FileStore fileStore, Long measurement, Timestamp timestamp) {
		super();
		this.fileStoreValueFileStore = fileStore;
		this.fileStoreValueMeasurementId = measurement;
		this.fileStoreValueTimestamp = timestamp;
	}

	@JsonIgnore
	public FileStore getFileStoreValueFileStore() {
		return fileStoreValueFileStore;
	}

	public void setFileStoreValueFileStore(FileStore fileStoreValueFileStore) {
		this.fileStoreValueFileStore = fileStoreValueFileStore;
	}

	public Long getFileStoreValueMeasurementId() {
		return fileStoreValueMeasurementId;
	}

	public void setFileStoreValueMeasurementId(Long fileStoreValueMeasurementId) {
		this.fileStoreValueMeasurementId = fileStoreValueMeasurementId;
	}

	public Timestamp getFileStoreValueTimestamp() {
		return fileStoreValueTimestamp;
	}

	public void setFileStoreValueTimestamp(Timestamp fileStoreValueTimestamp) {
		this.fileStoreValueTimestamp = fileStoreValueTimestamp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
