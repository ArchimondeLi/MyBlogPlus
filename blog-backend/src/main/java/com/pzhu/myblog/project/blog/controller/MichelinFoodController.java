package com.pzhu.myblog.project.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pzhu.myblog.common.constant.CodeStatus;
import com.pzhu.myblog.common.dto.BaseResult;
import com.pzhu.myblog.project.blog.domain.BlogCategory;
import com.pzhu.myblog.project.blog.domain.MichelinFood;
import com.pzhu.myblog.project.blog.service.MichelinFoodService;
import com.pzhu.myblog.project.blog.vo.MichelinFoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 食品操作controller层
 *
 * @Author Guo Huaijian
 * @Date 2020/1/12 20:44
 */
@RestController
@RequestMapping("food")
public class MichelinFoodController {

    @Autowired
    private MichelinFoodService michelinFoodService;

    /**
     * 查询操作
     */
    @GetMapping("list")
    public BaseResult selectAll(){
        List<MichelinFood> michelinFoods = michelinFoodService.selectAll();
        List<MichelinFoodVO> michelinFoodVOS = new ArrayList<>();
        for (MichelinFood food : michelinFoods) {
            MichelinFoodVO michelinFoodVO = new MichelinFoodVO();
            michelinFoodVO.setId(food.getId());
            michelinFoodVO.setName(food.getName());
            michelinFoodVOS.add(michelinFoodVO);
        }
        return BaseResult.success(CodeStatus.OK,michelinFoodVOS,"请求成功");
    }


    /**
     * 查询食品信息
     */
    @GetMapping("detail/{id}")
    public BaseResult selectById(@PathVariable int id){
        MichelinFood michelinFood = michelinFoodService.selectById(id);
        return BaseResult.success(CodeStatus.OK,michelinFood,"请求成功");
    }

    /**
     * 添加食品
     */
    @PostMapping("add")
    public BaseResult addFood(@RequestBody MichelinFood michelinFood){
        int i = michelinFoodService.addFood(michelinFood);
        return BaseResult.success("添加成功",CodeStatus.OK);
    }

    /**
     * 修改食品
     */
    @PutMapping("update/{id}")
    public BaseResult updateFood(@RequestBody MichelinFood michelinFood,@PathVariable int id){
        michelinFood.setId(id);
        michelinFood.setUpdateTime(new Date());
        int i = michelinFoodService.updateFood(michelinFood);
        return BaseResult.success("修改成功",CodeStatus.OK);
    }

    /**
     * 删除食品
     */
    @DeleteMapping("delete/{id}")
    public BaseResult deleteFood(@PathVariable int id){
        int i = michelinFoodService.deleteFood(id);
        return BaseResult.success("删除成功",CodeStatus.OK);
    }

    /**
     * 分页查询
     */
    @GetMapping("page/{currentPage}/{pageSize}")
    public BaseResult selectPageVo(@PathVariable int currentPage, @PathVariable int pageSize){
        Page<MichelinFood> page = new Page<>(currentPage,pageSize);
        Page<MichelinFood> pageVo = michelinFoodService.selectPageVo(page);
        return BaseResult.success(CodeStatus.OK,pageVo,"请求成功");
    }

}
