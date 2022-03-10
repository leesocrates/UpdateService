package com.lee.demo.controller;

import com.lee.demo.model.BaseResponse;
import com.lee.demo.model.update.CheckVersionBean;
import com.lee.demo.model.update.UpdateInfoBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UpdateApkController {

    @ResponseBody
    @PostMapping("/checkVersion")
    public BaseResponse<UpdateInfoBean> checkVersion(CheckVersionBean bean){

        return null;
    }

    public void updateNewVersion(){
    }
}
