package de.tub.qds.rm.models.consts;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.tub.qds.rm.models.values.FileStoreValue;

@Entity
public class FileStore implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String fileStoreUuid;
	Long fileStoreTotalSpace;
	String fileStoreName;
	String fileStoreVolume;
	String fileStoreMountPoint;
	String fileStoreDescription;
	String fileStoreFsType;
	@ManyToOne(targetEntity = Disk.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Disk fileStoreDisk;
	@OneToMany(mappedBy = "fileStoreValueId.fileStoreValueFileStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Set<FileStoreValue> fileStoreValues;

	public FileStore() {
	}

	public FileStore(String uuid, Long totalSpace, String name, String volume, String mountPoint, String description,
			String fsType) {
		super();
		this.fileStoreUuid = uuid;
		this.fileStoreTotalSpace = totalSpace;
		this.fileStoreName = name;
		this.fileStoreVolume = volume;
		this.fileStoreMountPoint = mountPoint;
		this.fileStoreDescription = description;
		this.fileStoreFsType = fsType;
		this.fileStoreValues = new HashSet<FileStoreValue>();
	}

	public String getFileStoreUuid() {
		return fileStoreUuid;
	}

	public void setFileStoreUuid(String fileStoreUuid) {
		this.fileStoreUuid = fileStoreUuid;
	}

	public Long getFileStoreTotalSpace() {
		return fileStoreTotalSpace;
	}

	public void setFileStoreTotalSpace(Long fileStoreTotalSpace) {
		this.fileStoreTotalSpace = fileStoreTotalSpace;
	}

	public String getFileStoreName() {
		return fileStoreName;
	}

	public void setFileStoreName(String fileStoreName) {
		this.fileStoreName = fileStoreName;
	}

	public String getFileStoreVolume() {
		return fileStoreVolume;
	}

	public void setFileStoreVolume(String fileStoreVolume) {
		this.fileStoreVolume = fileStoreVolume;
	}

	public String getFileStoreMountPoint() {
		return fileStoreMountPoint;
	}

	public void setFileStoreMountPoint(String fileStoreMountPoint) {
		this.fileStoreMountPoint = fileStoreMountPoint;
	}

	public String getFileStoreDescription() {
		return fileStoreDescription;
	}

	public void setFileStoreDescription(String fileStoreDescription) {
		this.fileStoreDescription = fileStoreDescription;
	}

	public String getFileStoreFsType() {
		return fileStoreFsType;
	}

	public void setFileStoreFsType(String fileStoreFsType) {
		this.fileStoreFsType = fileStoreFsType;
	}
	
	@JsonIgnore
	public Disk getFileStoreDisk() {
		return fileStoreDisk;
	}

	public void setFileStoreDisk(Disk fileStoreDisk) {
		this.fileStoreDisk = fileStoreDisk;
	}

	@JsonIgnore
	public Set<FileStoreValue> getFileStoreValues() {
		return fileStoreValues;
	}

	public void setFileStoreValues(Set<FileStoreValue> fileStoreValues) {
		this.fileStoreValues = fileStoreValues;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
