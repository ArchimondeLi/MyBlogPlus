package com.pzhu.myblog.project.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pzhu.myblog.common.constant.CodeStatus;
import com.pzhu.myblog.common.dto.BaseResult;
import com.pzhu.myblog.project.blog.domain.MichelinRestaurant;
import com.pzhu.myblog.project.blog.service.MichelinRestaurantService;
import com.pzhu.myblog.project.blog.vo.MichelinRestaurantVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 餐厅操作controller层
 *
 * @Author Guo Huaijian
 * @Date 2020/1/12 20:44
 */
@RestController
@RequestMapping("restaurant")
public class MichelinRestaurantController {

    @Autowired
    private MichelinRestaurantService michelinRestaurantService;

    /**
     * 查询操作
     */
    @GetMapping("list")
    public BaseResult selectAll(){
        List<MichelinRestaurant> michelinRestaurants = michelinRestaurantService.selectAll();
        List<MichelinRestaurantVO> michelinRestaurantVOS = new ArrayList<>();
        for (MichelinRestaurant restaurant : michelinRestaurants) {
            MichelinRestaurantVO michelinRestaurantVO = new MichelinRestaurantVO();
            michelinRestaurantVO.setId(restaurant.getId());
            michelinRestaurantVO.setName(restaurant.getName());
            michelinRestaurantVOS.add(michelinRestaurantVO);
        }
        return BaseResult.success(CodeStatus.OK,michelinRestaurantVOS,"请求成功");
    }

    /**
     * 添加餐厅
     */
    @PostMapping("add")
    public BaseResult addRestaurant(@RequestBody MichelinRestaurant michelinRestaurant){
        int i = michelinRestaurantService.addRestaurant(michelinRestaurant);
        return BaseResult.success("添加成功",CodeStatus.OK);
    }

    /**
     * 修改餐厅
     */
    @PutMapping("update/{id}")
    public BaseResult updateRestaurant(@RequestBody MichelinRestaurant michelinRestaurant,@PathVariable int id){
        michelinRestaurant.setId(id);
        michelinRestaurant.setUpdateTime(new Date());
        int i = michelinRestaurantService.updateRestaurant(michelinRestaurant);
        return BaseResult.success("修改成功",CodeStatus.OK);
    }

    /**
     * 删除餐厅
     */
    @DeleteMapping("delete/{id}")
    public BaseResult deleteRestaurant(@PathVariable int id){
        int i = michelinRestaurantService.deleteRestaurant(id);
        return BaseResult.success("删除成功",CodeStatus.OK);
    }

    /**
     * 分页查询
     */
    @GetMapping("page/{currentPage}/{pageSize}")
    public BaseResult selectPageVo(@PathVariable int currentPage, @PathVariable int pageSize){
        Page<MichelinRestaurant> page = new Page<>(currentPage,pageSize);
        Page<MichelinRestaurant> pageVo = michelinRestaurantService.selectPageVo(page);
        return BaseResult.success(CodeStatus.OK,pageVo,"请求成功");
    }

}
