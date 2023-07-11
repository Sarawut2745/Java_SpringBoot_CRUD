package com.kled.Hotel_Diploma_Teach.service;

import com.kled.Hotel_Diploma_Teach.entity.Page;
import com.kled.Hotel_Diploma_Teach.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImplement  implements PageService{

    @Autowired
    private PageRepository pageRepository;

    public PageServiceImplement(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @Override
    public List<Page> findAll(){
        return pageRepository.findAll();
    }// แสดงข้อมูลทั้งหมด

    @Override
    public Page findById(int id){
        return  pageRepository.findById(id).get();
    }// แก้ไขข้อมูล

    @Override
    public void save(Page thePage){
        pageRepository.save(thePage);
    }// เพิ่มข้อมูล

    @Override
    public void deleteById(int id){
        pageRepository.deleteById(id);
    }// ลบข้อมูล

}
