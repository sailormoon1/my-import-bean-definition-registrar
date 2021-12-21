package com.example.myspringcloud2.myspringcloudtwo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloServic {
    private String name;
    public void sayHello(){
        System.out.println(name+":你好啊！！！！");
    }
}
