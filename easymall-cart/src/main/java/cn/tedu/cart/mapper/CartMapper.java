package cn.tedu.cart.mapper;

import java.util.List;

import com.jt.common.pojo.Cart;

public interface CartMapper {

    List<Cart> selectCartsByUserId(String userId);

    Cart selectExistByUserIdAndProductId(Cart cart);

    void updateCartNumByUserIdAndProductId(Cart cart);

    void insertCart(Cart cart);

    void deleteCartByUserIdAndProductId(Cart cart);

}
