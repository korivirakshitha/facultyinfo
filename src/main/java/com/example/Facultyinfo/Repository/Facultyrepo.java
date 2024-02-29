package com.example.Facultyinfo.Repository;

import com.example.Facultyinfo.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Facultyrepo extends JpaRepository<Faculty,Integer> {
}
