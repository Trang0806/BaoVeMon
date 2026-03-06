package com.example.PhiThuTrang_PH61867;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaiHatServiceTest {
    BaiHatService baiHatService;
    @BeforeEach
    public void setUp(){
        baiHatService=new BaiHatService();
    }
    @Test
    public void testThemThanhCong(){
        int sizeTruoc=baiHatService.size();
        BaiHat bh=new BaiHat("BH1","A","Nguyen Van A",5f,"Trữ tình");
        baiHatService.themBaiHat(bh);
        assertEquals(sizeTruoc+1,baiHatService.size());
    }

    @Test
    public void testThemThanhCongTaiBienDuoi(){
        int sizeTruoc=baiHatService.size();
        BaiHat bh=new BaiHat("BH2","B","Nguyen Van B",2.0f,"Trữ tình");
        baiHatService.themBaiHat(bh);
        assertEquals(sizeTruoc+1,baiHatService.size());
    }
    @Test
    public void testThemThanhCongTaiBienTren(){
        int sizeTruoc=baiHatService.size();
        BaiHat bh=new BaiHat("BH2","B","Nguyen Van B",5.58f,"Trữ tình");
        baiHatService.themBaiHat(bh);
        assertEquals(sizeTruoc+1,baiHatService.size());
    }
    @Test
    public void testThemThanhCongTaiCanBienDuoi(){
        int sizeTruoc=baiHatService.size();
        BaiHat bh=new BaiHat("BH2","B","Nguyen Van B",2.1f,"Trữ tình");
        baiHatService.themBaiHat(bh);
        assertEquals(sizeTruoc+1,baiHatService.size());
    }
    @Test
    public void testThemThanhCongTaiCanBienTren(){
        int sizeTruoc=baiHatService.size();
        BaiHat bh=new BaiHat("BH2","B","Nguyen Van B",5.57f,"Trữ tình");
        baiHatService.themBaiHat(bh);
        assertEquals(sizeTruoc+1,baiHatService.size());
    }

    @Test
    public void testThemTaiBienTrênKoHopLe(){
        BaiHat bh=new BaiHat("BH2","B","Nguyen Van B",5.59f,"Trữ tình");

          assertThrows(IllegalArgumentException.class, () -> baiHatService.themBaiHat(bh));
    }

    @Test
    public void testThemNgoaiVung(){
        BaiHat bh=new BaiHat("BH2","B","Nguyen Van B",7.9f,"Trữ tình");
        assertThrows(IllegalArgumentException.class, () -> baiHatService.themBaiHat(bh));
    }




}