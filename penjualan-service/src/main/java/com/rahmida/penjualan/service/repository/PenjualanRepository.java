/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rahmida.penjualan.service.repository;

import com.rahmida.penjualan.service.VO.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public interface PenjualanRepository extends JpaRepository<Penjualan, Long>{
    public Penjualan findByPenjualanId(Long penjualanId);
    
}
