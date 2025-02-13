package base.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import base.po.Customer;
import base.service.CustomerService;
@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	/**
	 * 根据id查询客户详情
	 */
	@RequestMapping("/findCustomerById")
	public String findCustomerById(Integer id,Model model) {
		Customer customer = customerService.findCustomerById(id);
		model.addAttribute("customer", customer);
		//返回客户信息展示页面
		return "customer";
	}
}
