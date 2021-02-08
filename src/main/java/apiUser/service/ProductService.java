package apiUser.service;

import java.util.Map;
import java.util.Optional;

import apiUser.entity.Product;


public interface ProductService {

	Map<String, Object> insertProduct(Product product);
}
