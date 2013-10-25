package com.nhn.pinpoint.profiler.sender;

import org.apache.thrift.TBase;

/**
 *
 */
public interface EnhancedDataSender extends DataSender {

    boolean request(TBase<?, ?> data);

    boolean request(TBase<?, ?> data, int retry);
}
