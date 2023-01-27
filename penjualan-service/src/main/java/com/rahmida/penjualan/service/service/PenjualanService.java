/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.penjualan.service.service;


import com.rahmida.penjualan.service.VO.Pelanggan;
import com.rahmida.penjualan.service.VO.Penjualan;
import com.rahmida.penjualan.service.VO.ResponseTemplateVO;
import com.rahmida.penjualan.service.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 *
 * @author asus
 */
@Service
public class PenjualanService {

    @Autowired
    private PenjualanRepository penjualanRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Penjualan savePenjualan(Penjualan penjualan) {
        return penjualanRepository.save(penjualan);
    }

    public ResponseTemplateVO getPenjualan(Long penjualanId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Penjualan penjualan = penjualanRepository.findByPenjualanId(penjualanId);
//        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8888/pelangggan/" 
//              + penjualan.getPelangganId(), Pelanggan.class);
//        vo.setPelanggan(pelanggan);
        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8888/pelanggan/"
                + penjualan.getPelangganId(), Pelanggan.class);
        vo.setPenjualan(penjualan);
        vo.setPelanggan(pelanggan);
        return vo;
    }
}
