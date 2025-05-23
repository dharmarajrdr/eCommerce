package com.dharmaraj.e_commerce.services;

import com.dharmaraj.e_commerce.custom_exceptions.ProductNotFoundException;
import com.dharmaraj.e_commerce.custom_exceptions.UnAuthorizedAccessException;
import com.dharmaraj.e_commerce.custom_exceptions.UserNotFoundException;
import com.dharmaraj.e_commerce.models.Inventory;
import com.dharmaraj.e_commerce.models.Product;

public interface InventoryService {

    public Inventory createOrUpdateInventory(int userId, int productId, int quantity) throws ProductNotFoundException, UserNotFoundException, UnAuthorizedAccessException;

    public void deleteInventory(int userId, int productId) throws UserNotFoundException, UnAuthorizedAccessException;

    public void updateInventory(Product product, int quantity) throws ProductNotFoundException;
}
