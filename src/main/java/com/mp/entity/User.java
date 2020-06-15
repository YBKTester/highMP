package com.mp.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 实体类
 */
@Data
public class User {

    /**
     * 员工编号
     * 唯一主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 领导工号
     */
    private Long managerId;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
    /**
     * 版本号
     */
    @Version
    private Integer version;
    /**
     * 逻辑删除标识(0—未删除，1-已删除)
     */
    @TableLogic
    @TableField(select = false)
    private Integer deleted;

}
