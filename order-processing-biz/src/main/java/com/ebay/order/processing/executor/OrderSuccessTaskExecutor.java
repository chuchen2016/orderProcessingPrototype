package com.ebay.order.processing.executor;

import org.springframework.stereotype.Service;

import com.ebay.order.processing.model.dataObject.OrderTaskDO;


@Service("orderSuccessTaskExecutor")
public class OrderSuccessTaskExecutor implements OrderTaskExecutor {
	
	@Override
	public void execute(OrderTaskDO task) {
		
	}

	@Override
	public void onSuccess(OrderTaskDO task) {
		
	}

	@Override
	public void onFailure(OrderTaskDO task) {
		
	}

	
	
}