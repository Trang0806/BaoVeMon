package com.example.PhiThuTrang_PH61867;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    List<BaiHat> list=new ArrayList<>();
    public boolean themBaiHat(BaiHat baiHat){
        if (baiHat.getMa().isEmpty()||baiHat.getTen().isEmpty()||baiHat.getTenCaSi().isEmpty()||baiHat.getTheLoai().isEmpty()){
            return false;
        }
        if (baiHat.getThoiLuong()<2.00||baiHat.getThoiLuong()>5.59){
            return false;
        }
        list.add(baiHat);
        return true;
    }
    public int size(){
        return list.size();
    }
}
