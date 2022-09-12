package com.filedemo.filemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.filedemo.filemanagementsystem.model.FileDB;
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
