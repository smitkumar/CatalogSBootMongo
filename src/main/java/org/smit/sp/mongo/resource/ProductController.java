package org.smit.sp.mongo.resource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.smit.sp.mongo.app.main.CatalogRepository;
import org.smit.sp.mongo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/product")
@EnableAutoConfiguration
public class ProductController {

 /*@Autowired
 private MongoRepository repo;
	*/
	
  @Autowired
  public CatalogRepository catlogRepository;


  /*
   * Rest API to save  the product info into the mongo DB 
   * */
 
  @RequestMapping(value = "/v1", method = RequestMethod.POST)
  public @ResponseBody Map<String, Object> createBook(@RequestBody Map<String, Object> bookMap){
  System.out.println("**********&&&&&&&&&&&&&&&&&&********************");
	  Product product = new Product(bookMap.get("id").toString(),
        bookMap.get("name").toString(),
        bookMap.get("price").toString(),
        Integer.parseInt(bookMap.get("code").toString()));
	  System.out.println("********** product name ********************"+product.getProductName());
	  catlogRepository.save(product);
    Map<String, Object> response = new LinkedHashMap<String, Object>();
    response.put("message", "Product inserted in mongo DB  successfully");
    response.put("product", product);
    return response;
  }

  
  /*
   * Rest API to get  the product info from mongo DB based on Product ID 
   * */
  @RequestMapping(method = RequestMethod.GET, value="/{productId}")
  public @ResponseBody List<Product> getBookDetails(@PathVariable("productId") String productId){
	  System.out.println("**********&&&&&&&&&&&&&&&&&&********************"+productId);
	 
	   List<Product>  response =new ArrayList<Product>();	  
	  List<Product> book= catlogRepository.findAll();
	  response.add(book.get(0));
	  
    return response;
  }
  
  @RequestMapping(method=RequestMethod.GET)
  public @ResponseBody String sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
      return name;
  }
}