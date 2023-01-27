/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.penjualan.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author asus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelanggan {
    private Long pelangganId;
    private String nama;
    private String alamat;
    
}
