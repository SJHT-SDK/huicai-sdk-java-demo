package com.sjht.sdk.huicai.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 虚拟订单详情请求参数
 *
 * @author ChenBo
 */
@Data
public class VirtualOrderNotifyResult implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 用户手机号
     */
    private String userMobile;
    /**
     * 充值账号
     */
    private String rechargeAccount;
    /**
     * 充值参数,格式：{"phone":"13800000000","money":"30000"}
     */
    private String rechargeParams;
    /**
     * 充值状态 0-待处理 1-充值成功 2-充值失败 3-充值中
     */
    private Integer rechargeStatus;
    /**
     * 订单创建生成时间, 格式：yyyy-MM-dd HH:mm:ss
     */
    private String orderCreateTime;
    /**
     * 充值完成时间, 格式：yyyy-MM-dd HH:mm:ss
     */
    private String rechargeCompleteTime;
    /**
     * 充值失败原因
     */
    private String rechargeFailMessage;
    /**
     * 订单商品列表
     */
    private List<OrderGoods> goodsList;
    /**
     * 卡密信息。卡密类商品且充值状态为1(充值成功)时返回
     */
    private List<CardInfo> cards;

    /**
     * 虚拟订单商品信息
     *
     * @author ChenBo
     */
    @Data
    public static class OrderGoods implements Serializable {

        private static final long serialVersionUID = -1L;

        /**
         * SKU ID
         */
        private String skuId;
        /**
         * SKU名称
         */
        private String skuName;
        /**
         * 价格（单位：分）
         */
        private Integer price;
        /**
         * 下单数量
         */
        private Integer number;
        /**
         * 商品封面
         */
        private String cover;
        /**
         * 使用说明
         */
        private String useIllustrate;
    }

    /**
     * 虚拟订单卡密信息
     *
     * @author ChenBo
     */
    @Data
    public static class CardInfo implements Serializable {

        private static final long serialVersionUID = -1L;

        /**
         * 卡号
         */
        private String cardNo;
        /**
         * 密码
         */
        private String cardPassword;
        /**
         * 卡密有效期截止时间
         */
        private String cardDeadline;
    }
}
