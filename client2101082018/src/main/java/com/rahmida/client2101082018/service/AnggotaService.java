/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.client2101082018.service;

import com.rahmida.client2101082018.model.Anggota;
import com.google.gson.Gson;
import java.net.http.HttpResponse;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;


/**
 *
 * @author ASUS
 */
public class AnggotaService {
   private String url = "http://localhost:9012";
    
    public Anggota getAnggota(Long anggotaId){
        Anggota anggota = Unirest.get(url + "/anggota/"+anggotaId)
                .asObject(Anggota.class)
                .getBody();
        return anggota;
    }
    
    public Anggota saveAnggota(Anggota anggota){
        HttpResponse<JsonNode> response = Unirest.post(url + "/anggota/")
                .header("Content-Type", "application/json")
                .body(anggota)
                .asJson();
        Gson gson = new Gson();
        return gson.fromJson(response.getBody().toString(), Anggota.class);
    }
}