package com.example.PhiThuTrang_PH61867;

public class HocLuc {
    public String hocLuc(float diem){
        if (diem<0||diem>10){
            throw new IllegalArgumentException("Điểm trong khoảng 0-10");
        }
        if (diem>=9.0){
            return "Xuất sắc";
        }else if(diem>=7.0&&diem<9.0){
            return "Giỏi";
        }else if(diem>=5&&diem<7){
            return "Trung bình";
        }else if(diem<5.0){
            return "Yếu";
        }
     return "không hợp lệ";
    }

}
