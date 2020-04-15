package com.esi.webclient.proxy;

import com.esi.webclient.model.Formation;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ms-formation")
@RibbonClient(name="ms-formation", configuration = MyRibbon.class)
public interface FormationProxy {

    @GetMapping("/formations")
    CollectionModel<Formation> getFormations();
}
