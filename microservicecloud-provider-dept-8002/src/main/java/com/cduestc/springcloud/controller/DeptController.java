package com.cduestc.springcloud.controller;

import com.cduestc.springcloud.entites.Dept;
import com.cduestc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sh
 * @create 2019-06-16 16:55
 */
@RestController//这个注解比controller的提升，直接多一个ResponseBody
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add (@RequestBody Dept dept){
        return service.addDept(dept);
    }
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get (@PathVariable("id") long id){
        return service.findById(id);
    }
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list (){
        return service.findAll();
    }
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        System.out.println(client);
        List<String> list = client.getServices();
        System.out.println("***********"+list);
        System.out.println(list.size()+list.get(0));
        List<ServiceInstance> serviceInstanceList = client.getInstances("microservicecloud-dept8001");
        System.out.println(serviceInstanceList.size());
        for(ServiceInstance serviceInstance:serviceInstanceList)
        {
            System.out.println(serviceInstance.getServiceId()+"\t"
                    +serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());
        }
        return this.client;
    }
}