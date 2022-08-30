package com.ssg.ssg_be.cart.domain;

import com.ssg.ssg_be.product.domain.ProductOptionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartList {
    private Long cartId;
    private int count;
    private int cartTotal;
    private int cartSale;
    private int cartAmount;
    private ProductOptionDto productOptionDto;
}
