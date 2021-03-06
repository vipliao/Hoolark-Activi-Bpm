package com.hoolark.bpm.common;

import java.io.Serializable;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * restful的基本规范
 * @author Administrator
 * @param <T>
 * @param <ID>
 */
public interface RestServiceController<T, ID extends Serializable> {
    /**
     * 根据id查询资源
     * @param id 资源的唯一标识
     * @return
     */
    @GetMapping("{id}")
    Object getOne(@PathVariable("id") ID id);

    /**
     * 列表分页
     * @param rowSize 一页数据大小
     * @param page 当前页码
     * @return
     */
    @GetMapping
    Object getList(@RequestParam(value = "rowSize",defaultValue = "1000", required = false) Integer rowSize
            , @RequestParam(value = "page", defaultValue = "1", required = false) Integer page);

    /**
     * 提交一个资源
     * @param entity 资源实体
     * @return
     */
    @PostMapping
    Object postOne(@RequestBody T entity);

    /**
     * 提交一个资源，并给出标识
     * @param id 标识
     * @param entity 资源实体
     * @return
     */
    @PutMapping("{id}")
    Object putOne(@PathVariable("id") ID id, @RequestBody T entity);

    /**
     * 提交一个资源的一部分，不处理null值
     * @param id 标识
     * @param entity 资源实体
     * @return
     */
    @PatchMapping("{id}")
    Object patchOne(@PathVariable("id") ID id, @RequestBody T entity);

    /**
     * 根据id删除一个资源
     * @param id 标识
     * @return
     */
    @DeleteMapping("{id}")
    Object deleteOne(@PathVariable("id") ID id);
}
