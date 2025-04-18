package com.mycity.merchant.service;

import org.springframework.stereotype.Service;

import com.mycity.shared.merchantdto.MerchantLoginReq;
import com.mycity.shared.merchantdto.MerchantRegRequest;

@Service
public interface MerchantServiceInterface {

	String registerMerchant(MerchantRegRequest request);

	String loginMerchant(MerchantLoginReq request);

}
