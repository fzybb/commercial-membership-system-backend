package net.fzy.fitness.controller;

import net.fzy.fitness.model.entity.VideoOrder;
import net.fzy.fitness.model.request.VideoOrderRequest;
import net.fzy.fitness.service.VideoOrderService;
import net.fzy.fitness.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pri/order")
public class VideoOrderController {


    @Autowired
    private VideoOrderService videoOrderService;


    /**
     * 下单接口
     * @return
     */
    @RequestMapping("save")
    public JsonData saveOrder(@RequestBody(required=false) VideoOrderRequest videoOrderRequest, HttpServletRequest request){

        Integer userId = (Integer) request.getAttribute("user_id");


        int rows = videoOrderService.save(userId, videoOrderRequest.getVideoId());

        return rows == 0 ? JsonData.buildError("下单失败"):JsonData.buildSuccess();
    }


    /**
     * 订单列表
     * @param request
     * @return
     */
    @GetMapping("list")
    public JsonData listOrder(HttpServletRequest request){
        Integer userId = (Integer) request.getAttribute("user_id");

        List<VideoOrder> videoOrderList = videoOrderService.listOrderByUserId(userId);

        return JsonData.buildSuccess(videoOrderList);

    }


}
