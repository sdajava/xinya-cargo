package com.cargo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.commom.supper.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author jobob
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("订单表")
public class GeneralOrderEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String TYPE_1 = "1";
    public static final String TYPE_2 = "2";

    @TableId(value = "general_order_id", type = IdType.UUID)
    private String generalOrderId;

    @ApiModelProperty("订单号")
    private String generalOrderNo;

    @ApiModelProperty("意向单ID")
    private String intentionOrderId;

    @ApiModelProperty("订单状态 0:创建   1：终止")
    private String generalOrderStatus;

    @ApiModelProperty("调度状态  0:待调度    1：运输中    2：运输完")
    private String generalDispatchStatus;

    @ApiModelProperty("1:意向发起人是货主    2：意向发起人是承运商")
    private Integer type;

    @ApiModelProperty("意向单来自")
    private String fromUserId;

    @ApiModelProperty("意向单发向")
    private String toUserId;

    @ApiModelProperty("type为1时:承运商发布信息ID    2时：货主发布信息ID")
    private String resourceId;

    @ApiModelProperty("货主ID 等同于 创建人ID")
    private String cargoUserId;

    @ApiModelProperty("发货单位")
    private String senderOrgName;

    @ApiModelProperty("发货人")
    private String senderUserName;

    @ApiModelProperty("发货人联系方式")
    private String senderUserPhone;

    @ApiModelProperty("发货-区域ID 省ID")
    private String senderAreaProvinceId;

    private String senderAreaProvinceName;

    @ApiModelProperty("发货-区域ID 市ID")
    private String senderAreaCityId;

    private String senderAreaCityName;

    @ApiModelProperty("发货-区域ID 镇ID")
    private String senderAreaTownId;

    private String senderAreaTownName;

    @ApiModelProperty("发货地经纬度")
    private String senderProcityName;

    @ApiModelProperty("装货详细地址")
    private String senderAreaDetail;

    @ApiModelProperty("装货开始时间")
    private String senderStartTime;

    @ApiModelProperty("装货结束时间")
    private String senderEndTime;

    @ApiModelProperty("收货-区域ID 省ID")
    private String deliveryAreaProvinceId;

    @ApiModelProperty("收货-区域ID 省名称")
    private String deliveryAreaProvinceName;

    @ApiModelProperty("收货-区域ID 市ID")
    private String deliveryAreaCityId;

    private String deliveryAreaCityName;

    @ApiModelProperty("收货-区域ID 镇ID")
    private String deliveryAreaTownId;

    private String deliveryAreaTownName;

    @ApiModelProperty("卸货地经纬度")
    private String deliveryProcityName;

    @ApiModelProperty("收货详细地址")
    private String deliveryAreaDetail;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("计费方式ID")
    private String priceTypeId;

    @ApiModelProperty("预估里程数")
    private BigDecimal gpsMileage;

    @ApiModelProperty("运输类型ID")
    private String trspotTypeId;

    @ApiModelProperty("车辆要求ID")
    private String carTypeId;

    @ApiModelProperty("车辆尺寸Id")
    private BigDecimal carSizeId;

    @ApiModelProperty("审核备注")
    private String checkRemark;

    @ApiModelProperty("特殊要求")
    private String consignorRemark;

    @ApiModelProperty("收货单位")
    private String deliveryOrgName;

    @ApiModelProperty("收货人")
    private String deliveryUserName;

    @ApiModelProperty("收货人联系方式")
    private String deliveryUserPhone;

    @ApiModelProperty("拒绝备注")
    private String refuseRemark;

    private String createUser;

    private String updateUser;



}