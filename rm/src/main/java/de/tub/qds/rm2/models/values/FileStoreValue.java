package de.tub.qds.rm2.models.values;



import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import de.tub.qds.rm2.models.values.pks.FileStoreValuePK;

@Entity
public class FileStoreValue implements Serializable {

	@EmbeddedId
	FileStoreValuePK fileStoreValueId;
	long fileStoreValueUsableSpace;

	public FileStoreValue(){}

	public FileStoreValue(FileStoreValuePK id, long usableSpace) {
		super();
		this.fileStoreValueId = id;
		this.fileStoreValueUsableSpace = usableSpace;
	}

	public FileStoreValuePK getFileStoreValueId() {
		return fileStoreValueId;
	}
	public void setFileStoreValueId (FileStoreValuePK id){
		this.fileStoreValueId = id;
	}

	public long getFileStoreValueUsableSpace() {
		return fileStoreValueUsableSpace;
	}

	public void setFileStoreValueUsableSpace(long usableSpace) {
		this.fileStoreValueUsableSpace = usableSpace;
	}

}
