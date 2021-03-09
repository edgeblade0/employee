package com.tes.api.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.aspectj.bridge.Message;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pegawai")
@Validated
public class Employee {

    @Id
    @GeneratedValue
    private int userId;

    @Column(nullable = false,length = 100)
    private String nama;
    @Column(nullable = false)
    private  String alamat;

    public Employee(int userId, String nama, String alamat) {
        this.userId = userId;
        this.nama = nama;
        this.alamat = alamat;
    }

    public  Employee(){

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
