package com.kled.Hotel_Diploma_Teach.service;

import com.kled.Hotel_Diploma_Teach.entity.Page;

import java.util.List;
public interface PageService {
    public List<Page> findAll();// แสดงข้อมูลทั้งหมด
    public Page findById(int id);// แก้ไขข้อมูล
    public void save(Page thePage);// เพิ่มข้อมูล
    public void deleteById(int id);// ลบข้อมูล
}
