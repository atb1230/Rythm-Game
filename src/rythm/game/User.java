/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rythm.game;

/**
 *
 * @author ASUS
 */
class User {
    private String ID;
    private String TenNguoiDung;
    private float DIEM;
    
    public User(String ID, String TenNguoiDung, float DIEM)
    {
        this.ID = ID;
        this.TenNguoiDung = TenNguoiDung;
        this.DIEM = DIEM;
    }
    public String getID(){
        return  ID;
    }
    public String getTenNguoiDung(){
        return TenNguoiDung;
    }
    public float getDiem(){
        return DIEM;
    }
    
}
