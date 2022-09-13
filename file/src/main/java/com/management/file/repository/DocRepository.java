package com.management.file.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.management.file.model.Doc;

public interface DocRepository  extends JpaRepository<Doc,Integer>{

}