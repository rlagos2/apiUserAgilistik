package apiUser.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apiUser.entity.Product;
import apiUser.service.ProductService;


@RestController
public class ProductController {

	private final static Logger logger = Logger.getLogger(ProductController.class.getName());
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Map<String, Object>> insertProduct(@RequestBody Product product) {
		ResponseEntity<Map<String, Object>> responseFinal;
		logger.info("inicio servicio insertProduct");
		 
		 Map<String, Object> responseService = new HashMap<String, Object>();
		 responseService = productService.insertProduct(product);
		 
		 logger.info("fin servicio insertProduct");
		 if( responseService.containsKey("OK") ) {
			 responseFinal = new ResponseEntity<>(responseService, HttpStatus.OK); 
		 }else {
			 responseFinal = new ResponseEntity<>(responseService, HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
		 return responseFinal;
	}
	
	@RequestMapping(value = "/getProduct", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Map<String, Object>> getProduct() {
		 
		logger.info("inicio servicio getProduct");
		 
		 Map<String, Object> responseService = new LinkedHashMap<>();
		 
		 responseService.put("mensaje","Producto SKU 0000");
		 
		 logger.info("fin servicio getProduct");
		 
		 return new ResponseEntity<>(responseService, HttpStatus.OK);
	}
	
}
