package io.swagger.api;

import java.util.Map;
import io.swagger.model.Order;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * A delegate to be called by the {@link StoreApiController}}.
 * Should be implemented as a controller but without the {@link org.springframework.stereotype.Controller} annotation.
 * Instead, use spring to autowire this class into the {@link StoreApiController}.
 */

public interface StoreApiDelegate {

    /**
     * @see StoreApi#deleteOrder
     */
    ResponseEntity<Void> deleteOrder(String orderId);

    /**
     * @see StoreApi#getInventory
     */
    ResponseEntity<Map<String, Integer>> getInventory();

    /**
     * @see StoreApi#getOrderById
     */
    ResponseEntity<Order> getOrderById(Long orderId);

    /**
     * @see StoreApi#placeOrder
     */
    ResponseEntity<Order> placeOrder(Order body);

}
