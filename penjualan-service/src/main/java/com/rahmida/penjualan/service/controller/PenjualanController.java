/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.penjualan.service.controller;

import com.rahmida.penjualan.service.VO.Penjualan;
import com.rahmida.penjualan.service.VO.ResponseTemplateVO;
import com.rahmida.penjualan.service.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@RestController
@RequestMapping("/penjualan")
public class PenjualanController {

    @Autowired
    private PenjualanService penjualanService;

    @PostMapping("/")
    public Penjualan savePenjualan(@RequestBody Penjualan penjualan) {
        return penjualanService.savePenjualan(penjualan);
    }

    @GetMapping("{id}")
    public ResponseTemplateVO getPenjualan(@PathVariable("id") Long penjualanId) {
        return penjualanService.getPenjualan(penjualanId);
    }
}
