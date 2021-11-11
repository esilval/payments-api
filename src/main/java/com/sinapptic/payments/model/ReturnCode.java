package com.sinapptic.payments.model;

public enum ReturnCode {

    SUCCESS,
    FAIL_INVALIDENTITYCODE,
    FAIL_INVALIDSERVICECODE,
    FAIL_INVALIDREFERENCE1,
    FAIL_INVALIDTRANSVALUE,
    FAIL_INVALIDVATVALUE,
    FAIL_INVALIDCURRENCY,
    FAIL_INVALIDPOLICY,
    FAIL_INVALIDITEMS,
    FAIL_INVALIDAUTHREF,
    FAIL_INVALIDPAYMENTSYSTEM,
    FAIL_INVALIDFICODE,
    FAIL_SYSTEM,
    FAIL_TICKETIDNOTFOUND;
}