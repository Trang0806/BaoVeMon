package com.example.PhiThuTrang_PH61867;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocLucTest {
    HocLuc hocLuc=new HocLuc();
    @Test
    public void testHocLucXuatSac(){
        String rs=hocLuc.hocLuc(9.5f);
        String exp="Xuất sắc";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucGioi(){
        String rs=hocLuc.hocLuc(8.9f);
        String exp="Giỏi";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucTrungBinh(){
        String rs=hocLuc.hocLuc(6.4f);
        String exp="Trung bình";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucYếu(){
        String rs=hocLuc.hocLuc(4);
        String exp="Yếu";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucTaiBienDuoi(){
        String rs=hocLuc.hocLuc(0);
        String exp="Yếu";
        assertEquals(exp,rs);
    }
    @Test
    public void testHocLucTaiCanBienDuoiHopLe(){
        String rs=hocLuc.hocLuc(1);
        String exp="Yếu";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucCanBienDuoiKhongHopLe(){
        assertThrows(IllegalArgumentException.class,()->hocLuc.hocLuc(-1));
    }


    @Test
    public void testHocLucTaiBienTren(){
        String rs=hocLuc.hocLuc(10);
        String exp="Xuất sắc";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucTaiCanBienTrenHopLe(){
        String rs=hocLuc.hocLuc(9.9f);
        String exp="Xuất sắc";
        assertEquals(exp,rs);
    }

    @Test
    public void testHocLucCanBienTrenKhongHopLe(){
       assertThrows(IllegalArgumentException.class,()->hocLuc.hocLuc(11));
    }
}