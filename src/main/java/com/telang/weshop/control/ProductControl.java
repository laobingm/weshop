package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductControl {

    /*** 
     * 搜索页
     * @param model
     * @return
     */
    @RequestMapping(value = "product/search", method = RequestMethod.GET)
    public String search(Model model) {
        return "product/search.html";
    }
    /*** 
     * 产品页
     * @param model
     * @return
     */
    @RequestMapping(value = "product", method = RequestMethod.GET)
    public String product(Model model) {
        return "product/product.html";
    }
    /***
     * 产品详情页
     * @param model
     * @return
     */
    @RequestMapping(value = "product/introduction", method = RequestMethod.GET)
    public String introduction(Model model) {
        return "product/introduction.html";
    }
    /***
     * 购买成功页
     * @param model
     * @return
     */
    @RequestMapping(value = "product/success", method = RequestMethod.GET)
    public String success(Model model) {
        return "product/success.html";
    }
}
