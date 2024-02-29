package com.example.Facultyinfo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Faculty {

        @Id
        @Generated
        public int id;
        public String name;
        public String email;
        public String phone;
        public String department;
        public String position;
        public String office;
        public String password;

    }
