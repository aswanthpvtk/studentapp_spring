package com.example.studentapp2_backend.controller;

import com.example.studentapp2_backend.dao.StudentDao;
import com.example.studentapp2_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class studentcontroller {


    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage()
    {
        return "welcom to my web my my page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> PatientAdd(@RequestBody Students p)
    {

        System.out.println(p.getName().toString());
        dao.save(p);
        HashMap<String,String> map =new HashMap<>();
        map.put("status","success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/v")
    public List<Students> View()
    {
        return (List<Students>) dao.findAll();
    }



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Students> Search(@RequestBody Students s)
    {

        String admno=String.valueOf(s.getAdmno());

        return(List<Students>)dao.SearchStudent(s.getAdmno());
    }





}
