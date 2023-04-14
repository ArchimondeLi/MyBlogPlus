package com.pzhu.myblog.project.blog.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pzhu.myblog.project.blog.domain.MichelinFood;
import com.pzhu.myblog.project.blog.mapper.MichelinFoodMapper;
import com.pzhu.myblog.project.blog.service.MichelinFoodService;
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
public class MichelinFoodServiceImpl extends ServiceImpl<MichelinFoodMapper, MichelinFood> implements MichelinFoodService {

    @Autowired
    private MichelinFoodMapper michelinFoodMapper;

    /**
     * 查询全部食品
     */
    @Override
    public List<MichelinFood> selectAll() {
        return michelinFoodMapper.selectAll();
    }

    /**
     * 添加食品
     */
    @Override
    public int addFood(MichelinFood michelinFood) {
        michelinFood.setCreateTime(new Date());
        return michelinFoodMapper.insert(michelinFood);
    }

    /**
     * 修改食品
     */
    @Override
    public int updateFood(MichelinFood michelinFood) {
        return michelinFoodMapper.updateById(michelinFood);
    }

    /**
     * 删除食品
     */
    @Override
    public int deleteFood(int id) {
        return michelinFoodMapper.deleteById(id);
    }

    /**
     * 根据id查询食品
     */
    @Override
    public MichelinFood selectById(int id) {
        return michelinFoodMapper.selectById(id);
    }

    /**
     * 分页查询
     */
    @Override
    public Page<MichelinFood> selectPageVo(Page<?> page) {
        return michelinFoodMapper.selectPageVo(page);
    }
}
