package com.tes.api.service;

import com.tes.api.entity.Employee;
import com.tes.api.exception.EmployeeNotFoundException;
import com.tes.api.exception.EmployeeValidationException;
import com.tes.api.repository.EmployeeRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Object saveEmployee(Employee employee){
        if (employee.getNama() == "")
            throw new EmployeeValidationException("Nama harus diisi.");
        if (employee.getAlamat() == "")
            throw new EmployeeValidationException("Alamat harus diisi.");
        repository.save(employee);
        return ResponseEntity.ok("Sukses");
    }

    public Employee GetEmployeeById(int userId){
        return repository.findById(userId).orElseThrow(()->new EmployeeNotFoundException("Pegawai dengan id '"+userId+"' tidak ditemukan."));
    }
}
