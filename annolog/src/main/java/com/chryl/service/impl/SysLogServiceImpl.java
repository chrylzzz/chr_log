/*
 * Copyright (c) 2018-2999 广州亚米信息科技有限公司 All rights reserved.
 *
 * https://www.gz-yami.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.chryl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chryl.dao.SysLogMapper;
import com.chryl.model.SysLog;
import com.chryl.service.SysLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author lgh
 */
@Service("sysLogService")
@AllArgsConstructor
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    private final SysLogMapper sysLogMapper;
}
