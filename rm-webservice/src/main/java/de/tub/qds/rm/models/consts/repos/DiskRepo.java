package de.tub.qds.rm.models.consts.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tub.qds.rm.models.consts.Disk;

public interface DiskRepo extends JpaRepository<Disk, String> {

}
