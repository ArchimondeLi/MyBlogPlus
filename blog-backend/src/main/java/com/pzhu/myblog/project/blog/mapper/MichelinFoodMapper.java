package com.pzhu.myblog.project.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pzhu.myblog.project.blog.domain.MichelinFood;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 食品操作mapper层
 *
 * @Author Guo Huaijian
 * @Date 2019/12/28
 */
@Component
public interface MichelinFoodMapper extends BaseMapper<MichelinFood> {

    /**
     * 查询全部食品
     * @return
     */
   List<MichelinFood> selectAll();

    /**
     * 根据食品名查询
     * @param name
     * @return
     */
    MichelinFood selectByName(String name);

    /**
     * <p>
     * 查询 : 根据state状态查询食品列表，分页显示
     * </p>
     *
     * @param page 分页对象,传递参数给 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @return 分页对象
     */
    Page<MichelinFood> selectPageVo(Page<?> page);


}
