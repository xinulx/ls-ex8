package cn.lonsun.datacollect.service;

import cn.lonsun.core.base.service.IMockService;
import cn.lonsun.core.util.Pagination;
import cn.lonsun.datacollect.entity.DBCollectTaskEO;
import cn.lonsun.datacollect.vo.CollectPageVO;

/**
 * @author gu.fei
 * @version 2016-1-21 14:31
 */
public interface IDBCollectTaskService extends IMockService<DBCollectTaskEO> {

    /**
     * 分页查询采集任务数据
     * @param vo
     * @return
     */
    public Pagination getPageEOs(CollectPageVO vo);

    /**
     * 保存采集任务
     * @param eo
     */
    public void saveEO(DBCollectTaskEO eo);

    /**
     * 更新采集任务
     * @param eo
     */
    public void updateEO(DBCollectTaskEO eo);

    /**
     * 删除采集任务
     * @param ids
     */
    public void deleteEOs(Long[] ids);

    /**
     * 执行采集任务
     * @param taskId
     * @return
     */
    public void execTask(Long taskId) throws Exception;

}
