package love.you.po;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.id
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_id
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_name
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_title
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private String productTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_desc
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private String productDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_price
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private Double productPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_entrance
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private String productEntrance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.produc_sale_quantity
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private Integer producSaleQuantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.create_time
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.update_time
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.remark
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_image
     *
     * @mbggenerated Thu Apr 05 21:57:29 CST 2018
     */
    private byte[] productImage;

}