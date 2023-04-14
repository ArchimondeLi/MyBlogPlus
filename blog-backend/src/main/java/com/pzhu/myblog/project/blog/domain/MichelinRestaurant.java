package com.pzhu.myblog.project.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Guo Huaijian
 * @Date 2019/12/28
 */
@Data
@TableName(value = "michelin_restaurant")
public class MichelinRestaurant implements Serializable {
    /**
     * 餐厅id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 餐厅名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 餐厅描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 餐厅地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 餐厅所属省份
     */
    @TableField(value = "province")
    private Integer province;

    /**
     * 图1
     */
    @TableField(value = "img1")
    private String img1;

    /**
     * 图2
     */
    @TableField(value = "img2")
    private String img2;

    /**
     * 图3
     */
    @TableField(value = "img3")
    private String img3;

    /**
     * 经度
     */
    @TableField(value = "longitude")
    private BigDecimal longitude;

    /**
     * 纬度
     */
    @TableField(value = "longitude")
    private BigDecimal latitude;

    /**
     * 创建时间
     */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_ADDRESS = "address";

    public static final String COL_PROVINCE = "province";

    public static final String COL_IMG1 = "img1";

    public static final String COL_IMG2 = "img2";

    public static final String COL_IMG3 = "img3";

    public static final String COL_LONGITUDE = "longitude";

    public static final String COL_LATITUDE = "latitude";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}
