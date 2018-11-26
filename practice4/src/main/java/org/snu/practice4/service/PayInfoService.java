package org.snu.practice4.service;

import lombok.extern.slf4j.Slf4j;
import org.snu.practice4.dto.PayInfo;
import org.snu.practice4.mapper.PayInfoMapper;
import org.snu.practice4.model.DefaultRes;
import org.snu.practice4.utils.ResponseMessage;
import org.snu.practice4.utils.StatusCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.interceptor.TransactionAttribute;

import java.util.List;

@Slf4j
@Service
public class PayInfoService {

    private final PayInfoMapper payInfoMapper;

    public PayInfoService(final PayInfoMapper payInfoMapper) {
        this.payInfoMapper = payInfoMapper;
    }

    public DefaultRes getAllpayInfo() {
        final List<PayInfo> payInfoList = payInfoMapper.findAll();
        if (payInfoList.isEmpty())
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_PAYINFO);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_PAYINFO, payInfoList);
    }

    public DefaultRes findById(final int id) {
        final PayInfo payInfo = payInfoMapper.findById(id);
        if (payInfo == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_PAYINFO);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_PAYINFO, payInfo);
    }

    @Transactional
    public DefaultRes save(final PayInfo payInfo) {
        try {
            payInfoMapper.save(payInfo);
            return DefaultRes.res(StatusCode.CREATED, ResponseMessage.CREATED_PAYINFO);
        } catch (Exception e) {
            // Rollback
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }
}
