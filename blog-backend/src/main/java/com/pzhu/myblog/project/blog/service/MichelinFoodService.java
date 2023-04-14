package com.pzhu.myblog.project.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pzhu.myblog.project.blog.domain.MichelinFood;

import java.util.List;

/**
 * 食品操作service层
 *
 * @Author Guo Huaijian
 * @Date 2019/12/28
 */
public interface MichelinFoodService extends IService<MichelinFood>{

    /**
     * 查询全部食品
     */
    List<MichelinFood> selectAll();

    /**
     * 添加食品
     */
    int addFood(MichelinFood michelinFood);

    /**
     * 修改食品
     */
    int updateFood(MichelinFood michelinFood);

    /**
     * 删除食品
     */
    int deleteFood(int id);

    /**
     * 根据id查询食品
     */
    MichelinFood selectById(int id);

    /**
     * 分页查询
     */
    Page<MichelinFood> selectPageVo(Page<?> page);
}
