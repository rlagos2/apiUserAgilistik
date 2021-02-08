package apiUser.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiUser.entity.Product;
import apiUser.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Map<String, Object> insertProduct(Product product) {
		Map<String, Object> responseService = new HashMap<String, Object>();
		Product productSaved = null;
		try {
			productSaved = productRepository.save(product);
			responseService.put("OK", productSaved);
		}catch(Exception e) {
			System.out.println("Error al insertar producto"+e.getMessage());
			responseService.put("ERROR", "Error al insertar producto");
		}
		return responseService;
		
	}
	
	

}
