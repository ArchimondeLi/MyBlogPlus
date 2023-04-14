package com.pzhu.myblog.project.blog.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pzhu.myblog.project.blog.domain.MichelinRestaurant;
import com.pzhu.myblog.project.blog.mapper.MichelinRestaurantMapper;
import com.pzhu.myblog.project.blog.service.MichelinRestaurantService;
import com.pzhu.myblog.project.user.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author Guo Huaijian
 * @Date 2019/12/28
 */
@Service
public class MichelinRestaurantServiceImpl extends ServiceImpl<MichelinRestaurantMapper, MichelinRestaurant> implements MichelinRestaurantService {

    @Autowired
    private MichelinRestaurantMapper michelinRestaurantMapper;

    /**
     * 查询全部餐厅
     */
    @Override
    public List<MichelinRestaurant> selectAll() {
        return michelinRestaurantMapper.selectAll();
    }

    /**
     * 添加餐厅
     */
    @Override
    public int addRestaurant(MichelinRestaurant michelinRestaurant) {
        michelinRestaurant.setCreateTime(new Date());
        return michelinRestaurantMapper.insert(michelinRestaurant);
    }

    /**
     * 修改餐厅
     */
    @Override
    public int updateRestaurant(MichelinRestaurant michelinRestaurant) {
        return michelinRestaurantMapper.updateById(michelinRestaurant);
    }

    /**
     * 删除餐厅
     */
    @Override
    public int deleteRestaurant(int id) {
        return michelinRestaurantMapper.deleteById(id);
    }

    /**
     * 根据id查询餐厅
     */
    @Override
    public MichelinRestaurant selectById(int id) {
        return michelinRestaurantMapper.selectById(id);
    }

    /**
     * 分页查询
     */
    @Override
    public Page<MichelinRestaurant> selectPageVo(Page<?> page) {
        return michelinRestaurantMapper.selectPageVo(page);
    }
}
