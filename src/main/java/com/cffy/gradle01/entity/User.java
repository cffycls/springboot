package com.cffy.gradle01.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.cffy.gradle01.enums.SexEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@TableName("User")
public class User {
    private Long id;
    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private SexEnum gender;
    private LocalDateTime createdAt;

}
