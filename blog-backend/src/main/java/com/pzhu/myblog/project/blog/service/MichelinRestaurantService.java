package com.pzhu.myblog.project.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pzhu.myblog.project.blog.domain.MichelinRestaurant;

import java.util.List;

/**
 * 餐厅操作service层
 *
 * @Author Guo Huaijian
 * @Date 2019/12/28
 */
public interface MichelinRestaurantService extends IService<MichelinRestaurant>{

    /**
     * 查询全部餐厅
     */
    List<MichelinRestaurant> selectAll();

    /**
     * 添加餐厅
     */
    int addRestaurant(MichelinRestaurant michelinRestaurant);

    /**
     * 修改餐厅
     */
    int updateRestaurant(MichelinRestaurant michelinRestaurant);

    /**
     * 删除餐厅
     */
    int deleteRestaurant(int id);

    /**
     * 根据id查询餐厅
     */
    MichelinRestaurant selectById(int id);

    /**
     * 分页查询
     */
    Page<MichelinRestaurant> selectPageVo(Page<?> page);
}
