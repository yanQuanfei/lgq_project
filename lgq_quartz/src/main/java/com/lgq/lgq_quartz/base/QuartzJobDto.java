package com.lgq.lgq_quartz.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @auther: lgq
 * @time: 2019/9/16 17:11
 * @description: 定时任务配置类
 */
@Data
@ApiModel("定时任务配置类")
public class QuartzJobDto {

    /**
     * 工作名称
     */
    @ApiModelProperty(value = "工作名称",dataType = "String")
    private String jobName;
    /**
     * 工作组名称
     */
    @ApiModelProperty(value = "工作组名称",dataType = "String")
    private String jobGroupName;
    /**
     * 触发器名称
     */
    @ApiModelProperty(value = "触发器名称",dataType = "String")
    private String triggerName;
    /**
     * 触发器组名称
     */
    @ApiModelProperty(value = "触发器组名称",dataType = "String")
    private String triggerGroupName;
    /**
     *  执行器全类路径名:执行器必须继承QuartzJobBean
     */
    @ApiModelProperty(value = "执行器全类路径名:执行器必须继承QuartzJobBean",dataType = "String")
    private String jobClassName;
    /**
     * cron表达式
     */
    @ApiModelProperty(value = "cron表达式",dataType = "String")
    private String cron;
}
